package com.upao.eduaccess.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ComentarioDTO {

    private Long id;  // El ID puede no ser necesario en la creación, pero útil para obtener o eliminar comentarios

    @NotBlank(message = "El texto del comentario no puede estar vacío.")
    private String texto;

    @NotNull(message = "El ID del curso es obligatorio.")
    private Long cursoId;

    @NotNull(message = "El ID del estudiante es obligatorio.")
    private Long estudianteId;

    private Date fecha;

    @NotBlank(message = "El autor es obligatorio.")
    private String autor; // Nombre del autor del comentario

    private List<ComentarioDTO> respuestas; // Lista de respuestas asociadas al comentario
}

