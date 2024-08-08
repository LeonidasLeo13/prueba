package com.example.pruebatecnica.products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pruebatecnica.products.entities.Cliente;

public interface ClientesRepository extends JpaRepository<Cliente, Long>{
	
	public Cliente save(long id);

}
