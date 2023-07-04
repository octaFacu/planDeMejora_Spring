package com.ejemplo.ejemploSpring.servicios;

import com.ejemplo.ejemploSpring.entidades.Libro;
import com.ejemplo.ejemploSpring.repositorios.RepositorioLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioLibro extends ServicioGenericoImpl<Libro,Long> implements ServicioLibroInterface{

    @Autowired
    private RepositorioLibro repoLibro;

    //Filtro paginado
    @Override
    public Page<Libro> filtroPaginado(Pageable pageable, String filter) throws Exception {

        try {
            //Page<Libro> entities = repository.findAll(pageable);
            Page<Libro> entities = repoLibro.filtroPaginado(pageable, filter);
            return entities;

        }catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //Filtro
    @Override
    public List<Libro> filtro(String filter) throws Exception {

        try {
            List<Libro> entities = repoLibro.filtro(filter);
            return entities;

        }catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }


}
