package com.fabiokusaba.tasks.domain.dtos;

public record ErrorResponse(
        int status,
        String message,
        String details
) {
}
