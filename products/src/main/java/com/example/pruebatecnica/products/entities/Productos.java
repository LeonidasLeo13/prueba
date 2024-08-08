package com.example.pruebatecnica.products.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Productos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany
	@JoinColumn(name="id_producto")
	private long idProducto;
	
	private long clave;
	
	private String descripcion;
	
	private boolean activo;
	
	
	
	
}
