package com.ejemplo.ejemploSpring.servicios;

import com.ejemplo.ejemploSpring.entidades.Autor;
import com.ejemplo.ejemploSpring.repositorios.RepositorioAutor;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioAutor extends ServicioGenericoImpl<Autor,Long> implements ServicioAutorInterface {



}
