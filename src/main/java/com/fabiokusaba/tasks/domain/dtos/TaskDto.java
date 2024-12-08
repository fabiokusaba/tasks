package com.fabiokusaba.tasks.domain.dtos;

import com.fabiokusaba.tasks.domain.enums.TaskPriority;
import com.fabiokusaba.tasks.domain.enums.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
