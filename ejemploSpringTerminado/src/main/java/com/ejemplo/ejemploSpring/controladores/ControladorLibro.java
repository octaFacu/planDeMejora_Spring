package com.ejemplo.ejemploSpring.controladores;

import com.ejemplo.ejemploSpring.entidades.Libro;
import com.ejemplo.ejemploSpring.servicios.ServicioLibro;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/libro")
public class ControladorLibro extends ControladorGenericoImplementacion<Libro, ServicioLibro>{
}
