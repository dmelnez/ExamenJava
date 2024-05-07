package Dtos;

import java.time.LocalDateTime;


/*
 * Clase que contendra los atributos necesarios, los cuales compondran a un Paciente.
 * */
public class PacienteDtos {


	long id;
	
	String dniCliente = "aaaaa";
	
	String nombreCliente = "aaaaa";
	
	String apellidos = "aaaaaa";
		
	boolean esValidado = false;
	
	LocalDateTime fechaAlta = LocalDateTime.now();	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public boolean getEsValidado() {
		return esValidado;
	}

	public void setEsValidado(boolean esValidado) {
		this.esValidado = esValidado;
	}

	public LocalDateTime getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDateTime fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	

	public PacienteDtos(long id, String dniCliente, String nombreCliente, String apellidos, boolean esValidado) {
		super();
		this.id = id;
		this.dniCliente = dniCliente;
		this.nombreCliente = nombreCliente;
		this.apellidos = apellidos;
		this.esValidado = esValidado;
	}
	
	public PacienteDtos() {}

}
