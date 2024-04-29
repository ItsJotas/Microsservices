package com.ms.user.models.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRecordDTO(@NotBlank String name,
                            @NotBlank @Email(message = "Email Inválido") String email) {
}
