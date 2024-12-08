package com.fabiokusaba.tasks.mappers;

import com.fabiokusaba.tasks.domain.dtos.TaskDto;
import com.fabiokusaba.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
