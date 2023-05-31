package com.ejemplo.ejemploSpring.servicios;

import com.ejemplo.ejemploSpring.entidades.Libro;
import org.springframework.stereotype.Service;

@Service
public class ImplServicioLibro extends GenericServiceImpl<Libro, Long> implements InterfazServicioLibro{
}
