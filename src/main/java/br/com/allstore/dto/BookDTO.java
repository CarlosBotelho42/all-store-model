package br.com.allstore.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BookDTO(

        Long id,

        @NotBlank
        String name,

        @NotBlank
        String author,

        @NotNull
        Float price) {
}
