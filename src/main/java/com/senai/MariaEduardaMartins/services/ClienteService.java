package com.senai.MariaEduardaMartins.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.MariaEduardaMartins.entities.cliente;
import com.senai.MariaEduardaMartins.repository.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository ClienteRepository;
	
@Autowired
public ClienteService (ClienteRepository ClienteRepository) {
	this.ClienteRepository = ClienteRepository;
}
public cliente savecliente (cliente Cliente) {
	return ClienteRepository.save(Cliente);
}

public cliente getclienteById (long idcCliente) {
	return ClienteRepository.findById(idcCliente).orElse(null);
}
public List<cliente> getAllCliente(){
	return ClienteRepository.findAll();
}
public void deletecliente (Long idcCliente) {
	ClienteRepository.deleteById(idcCliente);
}
}
