package com.ejemplo.ejemploSpring.controladores;

import com.ejemplo.ejemploSpring.servicios.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class GenericControllerImpl<T, S extends GenericServiceImpl<T, Long>> implements GenericController<T, Long> {

    @Autowired
    protected S service;

    @Override
    @GetMapping
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, intente mas tarde.\"}");
        }
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, intente mas tarde.\"}");
        }
    }

    @Override
    @PostMapping
    public ResponseEntity<?> save(@RequestBody T entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.save(entity));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, intente mas tarde.\"}");
        }
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody T entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.update(id, entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, intente mas tarde.\"}");
        }
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            service.deleteById(id);
            return ResponseEntity.noContent().build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, intente mas tarde.\"}");
        }
    }

    @Override
    @GetMapping("/paged")
    public ResponseEntity<?> getAll(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {

        try {
            //Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "id"));
            Pageable pageable = PageRequest.of(page, size);
            Page<T> productos = service.findAll(pageable);
            if (productos.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body("{\"error\":\"Error, no hay contenido para mostrar.\"}");
            }
            return ResponseEntity.status(HttpStatus.OK).body(productos);

        }catch(Exception e) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error por favor intente mas tarde.\"}");
        }
    }


}
