package com.ejemplo.ejemploSpring.repositorios;

import com.ejemplo.ejemploSpring.entidades.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLibro extends RepositorioGenerico<Libro,Long>{
}
