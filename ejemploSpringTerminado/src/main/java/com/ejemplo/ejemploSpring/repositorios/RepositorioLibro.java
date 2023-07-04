package com.ejemplo.ejemploSpring.repositorios;

import com.ejemplo.ejemploSpring.entidades.Libro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioLibro extends RepositorioGenerico<Libro,Long>{

    @Query("SELECT l FROM Libro l WHERE l.titulo LIKE %:filter%")
    List<Libro> filtro(@Param("filter") String filter);

    @Query("SELECT l FROM Libro l WHERE l.titulo LIKE %:filter%")
    Page<Libro> filtroPaginado(Pageable pageable, @Param("filter") String filter);



}
