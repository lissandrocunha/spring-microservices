package io.lissandrocunha.task.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Data
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	@NotNull()
//	@NotNull(message = "{NotNull.Task.name}")
	private String name;

	@Column
	@NotNull
//	@NotNull(message = "{NotNull.Task.description}")
	private String description;

}
