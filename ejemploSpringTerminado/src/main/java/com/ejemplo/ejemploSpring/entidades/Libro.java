package com.ejemplo.ejemploSpring.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;


//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_libro")
    private String titulo;

    private int anioPublicacion;

    @ManyToMany()
    @JoinTable(
            name = "libro_autor",
            joinColumns = @JoinColumn(name = "libro_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id",referencedColumnName = "id")
    )
    private Collection<Autor> autor;

    @ManyToOne
    @JoinColumn(name = "editorial_id")
    private Editorial editorial;

}
