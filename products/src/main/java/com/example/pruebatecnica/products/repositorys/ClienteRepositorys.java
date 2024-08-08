package com.example.pruebatecnica.products.repositorys;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.pruebatecnica.products.entities.Cliente;

@Repository
public interface ClienteRepositorys {
	
	public List<Cliente> consultaUsuarios(long id);
	public Cliente actualizaCliente(Cliente cliente);
	public Cliente eliminaClinte(long id);

}
