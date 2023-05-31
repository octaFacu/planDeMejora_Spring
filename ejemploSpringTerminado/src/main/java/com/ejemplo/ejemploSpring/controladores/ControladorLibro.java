package com.ejemplo.ejemploSpring.controladores;

import com.ejemplo.ejemploSpring.entidades.Libro;
import com.ejemplo.ejemploSpring.servicios.ImplServicioLibro;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/libro")
public class ControladorLibro extends GenericControllerImpl<Libro, ImplServicioLibro>{
}
