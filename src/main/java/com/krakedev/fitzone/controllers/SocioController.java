package com.krakedev.fitzone.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.fitzone.entidades.Socio;
import com.krakedev.fitzone.services.ServicioSocio;

@RestController
@RequestMapping("/socios")
public class SocioController {
	private ServicioSocio servicioSocio;

	public SocioController(ServicioSocio servicioSocio) {
	    this.servicioSocio = servicioSocio;
	}

	@PostMapping
	public ResponseEntity<Socio> crear(@RequestBody Socio socio) {
	    Socio creado = servicioSocio.crear(socio);
	    return ResponseEntity
	            .status(HttpStatus.CREATED)
	            .body(creado); 
	}
	
	@GetMapping
	public ResponseEntity<List<Socio>> listar() {
	    return ResponseEntity.ok(servicioSocio.listar());
	}
	
	@GetMapping("/estado")
	public ResponseEntity<List<Socio>> buscarPorEstado(
	        @RequestParam boolean activo) {
	    return ResponseEntity.ok(servicioSocio.buscarPorEstado(activo));
	}
}
