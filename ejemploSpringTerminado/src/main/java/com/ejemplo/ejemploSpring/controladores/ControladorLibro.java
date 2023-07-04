package com.ejemplo.ejemploSpring.controladores;

import com.ejemplo.ejemploSpring.entidades.Libro;
import com.ejemplo.ejemploSpring.servicios.ServicioLibro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/libro")
public class ControladorLibro extends ControladorGenericoImplementacion<Libro, ServicioLibro>{

    //Filtro Paginado
    @GetMapping("/filterPaged")
    public ResponseEntity<?> filtroPaginado(@RequestParam(required = false) String filter, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "5") Integer size) {

        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Libro> productos = service.filtroPaginado(pageable, filter);
            if (productos.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body("{\"error\":\"Error, no hay contenido para mostrar.\"}");
            }
            return ResponseEntity.status(HttpStatus.OK).body(productos);

        }catch(Exception e) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error por favor intente mas tarde.\"}");
        }
    }

    //Filtro
    @GetMapping("/filter")
    public ResponseEntity<?> filtro(@RequestParam(required = false) String filter) {

        try {
            List<Libro> productos = service.filtro(filter);
            if (productos.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body("{\"error\":\"Error, no hay contenido para mostrar.\"}");
            }
            return ResponseEntity.status(HttpStatus.OK).body(productos);

        }catch(Exception e) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error por favor intente mas tarde.\"}");
        }
    }

}
