package com.ista.examzuin.controller;

import com.ista.examzuin.entity.Carrera;
import com.ista.examzuin.service.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carrera")
public class CarreraCtrl {

    @Autowired
    CarreraService service;

    @GetMapping("/listar")
    public ResponseEntity<List<Carrera>> listarProductos() {
        return new ResponseEntity<>(service.findByAll(),
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Carrera> crearProducto(@RequestBody Carrera p) {
        return new ResponseEntity<>(service.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Carrera> actualizarProducto(@PathVariable Long id, @RequestBody Carrera p) {
        Carrera entiry = service.findById(id);
        if (entiry == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                entiry.setNombre(p.getNombre());
                entiry.setDescripcion(p.getDescripcion());
                entiry.setPeriodo(p.getPeriodo());
                entiry.setCicloes(p.getCicloes());
                return new ResponseEntity<>(service.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Carrera> eliminarProducto(@PathVariable Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
