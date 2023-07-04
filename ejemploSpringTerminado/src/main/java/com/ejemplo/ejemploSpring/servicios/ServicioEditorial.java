package com.ejemplo.ejemploSpring.servicios;

import com.ejemplo.ejemploSpring.entidades.Editorial;
import org.springframework.stereotype.Service;

@Service
public class ServicioEditorial extends ServicioGenericoImpl<Editorial,Long> implements ServicioEditorialInterface{
}
