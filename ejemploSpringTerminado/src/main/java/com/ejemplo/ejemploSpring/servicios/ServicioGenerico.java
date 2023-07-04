package com.ejemplo.ejemploSpring.servicios;

import com.ejemplo.ejemploSpring.entidades.Base;

import java.io.Serializable;
import java.util.List;

public interface ServicioGenerico<T extends Base, ID extends Serializable> {

    T findById(ID id) throws Exception;
    List<T> findAll() throws Exception;
    T save(T entity) throws Exception;
    T update(ID ID, T entity) throws Exception;
    void deleteById(ID id) throws Exception;

}
