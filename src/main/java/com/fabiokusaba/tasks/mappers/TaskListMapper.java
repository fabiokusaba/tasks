package com.fabiokusaba.tasks.mappers;

import com.fabiokusaba.tasks.domain.dtos.TaskListDto;
import com.fabiokusaba.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
