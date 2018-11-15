package pe.bss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.bss.model.Venta;
import pe.bss.service.IVentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {

	@Autowired
	private IVentaService service;
	
	@GetMapping(produces = "application/json")
	public List<Venta> listar() {
		return service.listar();
	}
	
	@PostMapping(produces = "application/json", consumes = "application/json")
	public Venta registrar(@RequestBody Venta venta) {
		return service.registrar(venta);
	}
}
