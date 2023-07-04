package com.ejemplo.ejemploSpring.controladores;

import com.ejemplo.ejemploSpring.entidades.Autor;
import com.ejemplo.ejemploSpring.servicios.ServicioAutor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/autor")
public class ControladorAutor extends ControladorGenericoImplementacion<Autor, ServicioAutor> {



}
