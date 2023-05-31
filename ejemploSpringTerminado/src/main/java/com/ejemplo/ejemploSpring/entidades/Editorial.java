package com.ejemplo.ejemploSpring.entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Editorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToOne
    @JoinColumn(name = "direccion_id")
    private Direccion direccion;


}
