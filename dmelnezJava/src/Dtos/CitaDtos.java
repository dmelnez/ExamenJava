package Dtos;

import java.time.LocalDateTime;
import java.util.Date;


/*
 * Clase que contendra los atributos necesarios, los cuales compondran a una cita de un paciente.
 * */
public class CitaDtos {

	String dniPaciente = "aaaaaa";
	
	String especialidad = "aaaaa";
	
	String fechaCita;
	
	public String getDniPaciente() {
		return dniPaciente;
	}

	public void setDniPaciente(String dniPaciente) {
		this.dniPaciente = dniPaciente;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(String fechaCita) {
		this.fechaCita = fechaCita;
	}

	
	public CitaDtos(String dniPaciente, String especialidad, String fechaCita) {
		super();
		this.dniPaciente = dniPaciente;
		this.especialidad = especialidad;
		this.fechaCita = fechaCita;
	}
	
	public CitaDtos() {}
	
}
