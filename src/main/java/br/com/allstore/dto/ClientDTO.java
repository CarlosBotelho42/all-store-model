package br.com.allstore.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public record ClientDTO(

        Long id,

        @NotBlank
        String name,

        @CPF
        @NotBlank
        String document,

        Float balance) {
}
