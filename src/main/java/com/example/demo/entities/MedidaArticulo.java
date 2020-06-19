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
	@Table(name = "medidaarticulo")	
	
	public class MedidaArticulo extends BaseEntity{	
	
	//Atributos:
		@Column
		private String denominacion;	
	
	
	//Relaciones:
	
	//Constructor por defecto:
	public MedidaArticulo(){
	}
	//Constructor Sobrecargado:
	public MedidaArticulo(
			String denominacion
		
		
	){
	
	    this.denominacion = denominacion;
	
	}
	//Getters:
		public String getDenominacion(){
			return this.denominacion;
		}
	
	
	//Setters:
		public void  setDenominacion(String denominacion){
			this.denominacion = denominacion;
		}

		
	
	//Metodos:
	
	
}
