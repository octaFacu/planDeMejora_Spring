package com.ejemplo.ejemploSpring.controladores;

import com.ejemplo.ejemploSpring.entidades.Direccion;
import com.ejemplo.ejemploSpring.servicios.ServicioDireccion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/direccion")
public class ControladorDireccion extends ControladorGenericoImplementacion<Direccion, ServicioDireccion>{
}
