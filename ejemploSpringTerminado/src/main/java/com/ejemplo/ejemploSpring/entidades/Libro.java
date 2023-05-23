package com.ejemplo.ejemploSpring.entidades;

import jakarta.persistence.*;
import lombok.*;


//@Data
@Getter
@Setter
//@NoArgsConstructor
@ToString
@Builder
@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_libro")
    private String titulo;

    private int anioPublicacion;

    private String autor;

    private String editorial;

}
