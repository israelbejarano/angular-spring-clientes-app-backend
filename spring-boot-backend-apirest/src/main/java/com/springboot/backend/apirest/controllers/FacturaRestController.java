package com.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.apirest.models.entity.Factura;
import com.springboot.backend.apirest.models.entity.Producto;
import com.springboot.backend.apirest.models.services.IClienteService;

@CrossOrigin(origins = {"http://localhost:4200", "*"}) // para prod real en vez de * poner la ip/direccion del server de prod
@RestController
@RequestMapping("/api")
public class FacturaRestController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/facturas/{id}")
	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@ResponseStatus(code = HttpStatus.OK)
	public Factura show(@PathVariable Long id) {
		return clienteService.findFacturaById(id);
	}
	
	@DeleteMapping("/facturas/{id}")
	@Secured({"ROLE_ADMIN"})
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.deleteFacturaById(id);
	}
	
	@GetMapping("/facturas/filtrar-productos/{term}")
	@Secured({"ROLE_ADMIN"})
	@ResponseStatus(code = HttpStatus.OK)
	public List<Producto> filtrarProductos(@PathVariable String term) {
		return clienteService.findProductoByNombre(term);
	}
	
	@PostMapping("/facturas")
	@Secured({"ROLE_ADMIN"})
	@ResponseStatus(code = HttpStatus.CREATED)
	public Factura crear(@RequestBody Factura factura) {
		return clienteService.saveFactura(factura);
	}

}
