package com.senai.MariaEduardaMartins.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.MariaEduardaMartins.entities.cliente;
import com.senai.MariaEduardaMartins.services.ClienteService;

@RestController
@RequestMapping("/clients")
public class ClienteController {
	private final ClienteService ClienteService;

	@Autowired
	public ClienteController(ClienteService ClienteService) {
		this.ClienteService = ClienteService;
	}

	@PostMapping
	public cliente create(@RequestBody cliente Cliente) {
		return ClienteService.savecliente(Cliente);
	}

	@GetMapping("/{idcCliente}")
	public cliente getCliente(@PathVariable Long idcCliente) {

		return ClienteService.getclienteById(idcCliente);
	}

	@GetMapping
	public List<cliente> getAllCliente() {
		return ClienteService.getAllCliente();
	}

	@DeleteMapping("/{idcCliente}")
	public void deleteCliente(@PathVariable Long idcCliente) {
		ClienteService.deletecliente(idcCliente);
	}

}
