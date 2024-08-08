package com.example.pruebatecnica.products.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Compras {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany
	private List<DetalleCompras> idLista;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Cliente idCliente;
	
	private String nombre;
	
	private Date fechaRegistro;
	
	private Date fechaUltimaActualizacion;
	private boolean activo;
	
	

}
