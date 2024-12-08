package com.fabiokusaba.tasks.services.impl;

import com.fabiokusaba.tasks.domain.entities.TaskList;
import com.fabiokusaba.tasks.repositories.TaskListRepository;
import com.fabiokusaba.tasks.services.TaskListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskListServiceImpl implements TaskListService {

    private final TaskListRepository taskListRepository;

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }
}
