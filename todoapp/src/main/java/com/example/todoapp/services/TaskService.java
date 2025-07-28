package com.example.todoapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.todoapp.models.Task;
import com.example.todoapp.repository.TaskRepository;

@Service
public class TaskService {

	private final TaskRepository taskRepository;
	
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	public List<Task> getAllTasks() {
	return taskRepository.findAll();
	}

}
