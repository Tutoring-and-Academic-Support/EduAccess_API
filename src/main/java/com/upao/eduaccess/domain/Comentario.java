package com.upao.eduaccess.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "comentario")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "texto", columnDefinition = "TEXT", nullable = false)
    private String texto;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "autor", nullable = false)
    private String autor; // Agregado: nombre del autor del comentario (estudiante o tutor)

    @ManyToOne
    @JoinColumn(name = "curso_id", referencedColumnName = "id", nullable = false)
    private Curso curso;
}
