//Paquetes:
package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalleplato")

public class DetallePlato extends BaseEntity {

	// Atributos:
	@Column
	private int cantidad;

	// Relaciones:

	@OneToOne(	fetch = FetchType.EAGER)
	@JoinColumn(name = "detallePlato_articulo")
	private Articulo articulo;

	@OneToOne(	fetch = FetchType.EAGER	)
	@JoinColumn(name = "detallePlato_medidaPlato")
	private MedidaPlato medidaPlato;
	/*
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "detallePlato_articulo")
	private Articulo articulo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "detallePlato_medidaPlato")
	private MedidaPlato medidaPlato;
*/
	// Constructor por defecto:
	public DetallePlato() {
	}

	// Constructor Sobrecargado:
	public DetallePlato(int cantidad

	) {

		this.cantidad = cantidad;

	}

	// Getters:
	public int getCantidad() {
		return this.cantidad;
	}

	

	// Setters:
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public void setMedidaPlato(MedidaPlato medidaPlato) {
		this.medidaPlato = medidaPlato;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public MedidaPlato getMedidaPlato() {
		return medidaPlato;
	}
	
	
	// Metodos:

}
