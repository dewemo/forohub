package com.dewemo.Forohub.topico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        @Valid
        String fechaCreacion
) {
}
