package com.ejemplo.ejemploSpring.servicios;

import com.ejemplo.ejemploSpring.entidades.Autor;
import com.ejemplo.ejemploSpring.entidades.Base;
import com.ejemplo.ejemploSpring.repositorios.RepositorioAutor;
import com.ejemplo.ejemploSpring.repositorios.RepositorioGenerico;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class ServicioGenericoImpl<T extends Base, ID extends Serializable> implements ServicioGenerico<T,ID> {

    @Autowired
    RepositorioGenerico<T,ID> repository;

    @Override
    public List<T> findAll() throws Exception {
        try {
            List<T> entities = repository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public T findById(ID id) throws Exception {
        try {
            Optional<T> entity = repository.findById(id);
            return entity.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public T save(T entity) throws Exception {
        try {
            entity = repository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public T update(ID id, T entity) throws Exception {
        try {
            Optional<T> entidad = repository.findById(id);
            T entidadActualizar = entidad.get();
            entidadActualizar = repository.save(entity);
            return entidadActualizar;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void deleteById(ID id) throws Exception {
        try {
            repository.deleteById(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
