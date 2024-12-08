package com.fabiokusaba.tasks.services;

import com.fabiokusaba.tasks.domain.entities.TaskList;

import java.util.List;

public interface TaskListService {

    List<TaskList> listTaskLists();
}
