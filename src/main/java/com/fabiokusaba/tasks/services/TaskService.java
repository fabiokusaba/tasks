package com.fabiokusaba.tasks.services;

import com.fabiokusaba.tasks.domain.entities.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {

    List<Task> listTasks(UUID taskListId);
}
