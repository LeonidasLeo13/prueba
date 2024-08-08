package com.example.pruebatecnica.products.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetalleCompras {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	private List<Compras> idListaCompra;
	
	@ManyToOne
	@JoinColumn(name = "codigoProducto")
	private Long codigoProducto;
	
	private int cantidad;
	
	
	
}

