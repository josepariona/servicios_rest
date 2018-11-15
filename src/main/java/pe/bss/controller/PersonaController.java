package pe.bss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.bss.model.Persona;
import pe.bss.service.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private IPersonaService service;

	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Persona>> listar() {
		List<Persona> listar = service.listar();
		return new ResponseEntity<List<Persona>>(listar, HttpStatus.OK);
	}

	@GetMapping(value = "/{id}", produces = "application/json")
	public Persona listarPorId(@PathVariable("id") Integer id) {
		return service.listarId(id);
	}

	@PostMapping(produces = "application/json", consumes = "application/json")
	public Persona registrar(@RequestBody Persona persona) {
		Persona registrar = service.registrar(persona);
		return service.registrar(registrar);
	}

	@PutMapping(produces = "application/json", consumes = "application/json")
	public Persona modificar(@RequestBody Persona persona) {
		return service.modificar(persona);
	}

	@DeleteMapping
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
