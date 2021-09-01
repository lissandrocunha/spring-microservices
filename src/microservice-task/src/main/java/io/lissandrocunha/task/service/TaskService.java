package io.lissandrocunha.task.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import io.lissandrocunha.task.dto.TaskDto;
import io.lissandrocunha.task.entity.Task;
import io.lissandrocunha.task.repository.TaskRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TaskService {

	private TaskRepository taskRepository;

	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public Page<Task> getTasks(Pageable pageAble) {
		return taskRepository.findAll(pageAble);
	}

	public Task getTask(Long id) {
		Optional<Task> task = taskRepository.findById(id);
		return task.get();
	}

	public Task saveTask(TaskDto taskDto) {
		ModelMapper modelMapper = new ModelMapper();

		Task task = modelMapper.map(taskDto, Task.class);
		return taskRepository.save(task);
	}

}
