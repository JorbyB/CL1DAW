package org.cibertec.edu.pe.Modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Productos {
	@javax.persistence.Id
	private String Id;
	private String Nombre;
	private double Precio;
	private String Descripcion;
	
	public Productos() {
	}
	
	public Productos(String id, String nombre, double precio, String descripcion) {
		Id = id;
		Nombre = nombre;
		Precio = precio;
		Descripcion = descripcion;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

}
