package com.ejemplo.ejemploSpring.controladores;

import com.ejemplo.ejemploSpring.entidades.Editorial;
import com.ejemplo.ejemploSpring.servicios.ServicioEditorial;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/editorial")
public class ControladorEditorial extends ControladorGenericoImplementacion<Editorial, ServicioEditorial>{
}
