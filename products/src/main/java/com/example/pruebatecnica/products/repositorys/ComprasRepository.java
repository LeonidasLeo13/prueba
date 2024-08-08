package com.example.pruebatecnica.products.repositorys;

import org.springframework.stereotype.Repository;

import com.example.pruebatecnica.products.entities.Compras;

@Repository
public interface ComprasRepository {
	
	public Compras guardaCompras(long id);
	public List<Compras> consultaListadoCompras(Compras compritas);
	
	
	

}
