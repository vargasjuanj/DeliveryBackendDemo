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
@Table(name = "articulo")

public class Articulo extends BaseEntity {

	// Atributos:
	@Column
	private String denominacion;

	@Column
	private String descripcion;
	@Column
	
	private int stockMin;
	@Column
	private int stockMax;
	@Column
	private int stockActual;
	@Column
	private boolean esInsumo;
	@Column
	private String imagen;
	@Column
	private float precioCompra;
	@Column
	private float precioVenta;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "articulo_categoriaArticulo")
	private CategoriaArticulo categoriaArticulo;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "articulo_medidaArticulo")
	private MedidaArticulo medidaArticulo;

	// Relaciones:

/*
	@OneToOne(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "articulo_categoriaArticulo")
	private CategoriaArticulo categoriaArticulo;
	

	//Con esas cascadas puedo crear la medida y editarlo por ejemplo, pero 
	@OneToOne(cascade ={CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
	@JoinColumn(name = "articulo_medidaArticulo")
	private MedidaArticulo medidaArticulo;
*/
	// Constructor por defecto:
	public Articulo() {
	}
	


	// Constructor Sobrecargado:

	// Getters:
	public String getDenominacion() {
		return this.denominacion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public int getStockMin() {
		return this.stockMin;
	}

	public int getStockMax() {
		return this.stockMax;
	}

	public int getStockActual() {
		return this.stockActual;
	}

	public boolean getEsInsumo() {
		return this.esInsumo;
	}

	public String getImagen() {
		return this.imagen;
	}

	public float getPrecioCompra() {
		return this.precioCompra;
	}

	public float getPrecioVenta() {
		return this.precioVenta;
	}

	

	// Setters:
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setStockMin(int stockMin) {
		this.stockMin = stockMin;
	}

	public void setStockMax(int stockMax) {
		this.stockMax = stockMax;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	public void setEsInsumo(boolean esInsumo) {
		this.esInsumo = esInsumo;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public void setCategoriaArticulo(CategoriaArticulo categoriaArticulo) {
		this.categoriaArticulo = categoriaArticulo;
	}

	public void setMedidaArticulo(MedidaArticulo medidaArticulo) {
		this.medidaArticulo = medidaArticulo;
	}

	public MedidaArticulo getMedidaArticulo() {
		return medidaArticulo;
	}

	public CategoriaArticulo getCategoriaArticulo() {
		return categoriaArticulo;
	}


	// Metodos:

}
