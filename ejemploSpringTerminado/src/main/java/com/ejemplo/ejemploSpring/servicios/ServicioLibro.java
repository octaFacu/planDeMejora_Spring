package com.ejemplo.ejemploSpring.servicios;

import com.ejemplo.ejemploSpring.entidades.Libro;
import org.springframework.stereotype.Service;

@Service
public class ServicioLibro extends ServicioGenericoImpl<Libro,Long> implements ServicioLibroInterface{
}
