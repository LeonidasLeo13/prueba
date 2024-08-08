package com.example.pruebatecnica.products.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pruebatecnica.products.entities.Cliente;
import com.example.pruebatecnica.products.repositories.ClientesRepository;
import com.example.pruebatecnica.products.repositorys.ClienteRepositorys;

@Service
public class ClienteServices implements ClienteRepositorys{
	
	private ClientesRepository clientesRepository;
	
	private ClienteRepositorys clienteRepositorys;
	
	public Cliente createCliente(Cliente cliente) {
		return clientesRepository.save(cliente.getId());
	}

	@Override
	public List<Cliente> consultaUsuarios(long id) {
		
		return clienteRepositorys.consultaUsuarios(id);
		
	}
	
	//pendientes
	@Override
	public Cliente actualizaCliente(Cliente cliente) {
		
		return null;
	}

	@Override
	public Cliente eliminaClinte(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
