package io.lissandrocunha.task.dto;

import lombok.Data;

@Data
public class TaskDto {

	private Long id;
	private String name;
	private String descrition;
	private String createDate;
}
