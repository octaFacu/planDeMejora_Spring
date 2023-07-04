package com.ejemplo.ejemploSpring.servicios;

import com.ejemplo.ejemploSpring.entidades.Libro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServicioLibroInterface extends ServicioGenerico<Libro,Long>{

    Page<Libro> filtroPaginado(Pageable pageable, String filter) throws Exception;
    List<Libro> filtro(String filter) throws Exception;

}
