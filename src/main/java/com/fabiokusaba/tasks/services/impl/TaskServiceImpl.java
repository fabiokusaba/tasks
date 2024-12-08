package com.fabiokusaba.tasks.services.impl;

import com.fabiokusaba.tasks.domain.entities.Task;
import com.fabiokusaba.tasks.repositories.TaskRepository;
import com.fabiokusaba.tasks.services.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> listTasks(UUID taskListId) {
        return taskRepository.findByTaskListId(taskListId);
    }
}
