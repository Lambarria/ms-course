package com.app.articulos.model;

import java.io.Serializable;
import java.util.Date;

public class Producto implements Serializable {

	/**
	 * Serial version.
	 */
	private static final long serialVersionUID = -7993966921168300981L;

	private Long id;
	private String nombre;
	private Double precio;
	private Date fechaCreacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
