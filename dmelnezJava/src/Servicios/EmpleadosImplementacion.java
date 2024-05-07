package Servicios;

import java.util.Iterator;
import java.util.Scanner;

import Controladores.Inicio;
import Dtos.CitaDtos;
import Dtos.PacienteDtos;

public class EmpleadosImplementacion implements EmpleadosInterfaz{

Scanner sc = new Scanner(System.in);
	
	MenuInterfaz me = new MenuImplementacion();
	
	FicherosInterfaz fi = new FicherosImplementacion();
	
	String ficheroLogCliente;
	
	
	public void menuEmpleados() {
		
		boolean esCerrarCliente = false;
	
	try {
		

		
		do {
			
			int seleccionMenuPrincipal = me.menuEmpleado();
			
			switch(seleccionMenuPrincipal) {
			
			case 0:
				System.out.println("[INFO] -> Cerrar Menu");
				ficheroLogCliente = "Se cerrara el Menu Empleado";
				fi.ficheroLog(ficheroLogCliente);
				esCerrarCliente = true;
				
				break;
				
			case 1:
				System.out.println("[INFO] -> Validar Nuevo Cliente");
				ficheroLogCliente = "Validar Nuevo Cliente.";
				fi.ficheroLog(ficheroLogCliente);
				
				validarCliente();
				esCerrarCliente = true;

				
				break;
			
			case 2:
				System.out.println("[INFO] -> Imprimir citas Medicas");
				ficheroLogCliente = "Imprimir citas Medicas.";
				fi.ficheroLog(ficheroLogCliente);
				imprimirCitasMedicas();
				esCerrarCliente = true;

				break;
				
				
			default:
				break;
			
			
			}
					
			
		}
		
		while(!esCerrarCliente);
		
	}
	
	catch (Exception e) {
		System.out.println("[ALERTA] -> Se ha producido un Error.");
		ficheroLogCliente = e.toString();
	}
	}
	
	
/*
 * Metodo encargado de mostrar todos los pacientes que no se encuetran validados.
 * Se solicitara el DNI del cliente a validar, y se validara (TRUE).
 * */
	private void validarCliente () {
		
		
		for(PacienteDtos pacientes : Inicio.listaPacientes) {
					
				if(pacientes.getEsValidado() == false) {
					
					System.out.println(pacientes.getDniCliente() + "-" + pacientes.getApellidos() + " " + pacientes.getNombreCliente());
					
				}
				
			}
		
		System.out.println("DNI a validar: ");
		String dniAValidar = sc.next();
		
		
		for(PacienteDtos pacientes : Inicio.listaPacientes) {
			
			if(pacientes.getDniCliente().equals(dniAValidar)) {
				
				pacientes.setEsValidado(true);
				System.out.println(pacientes.getEsValidado());
				
				
			}
			
			
		}
		
		
	}
	
	
/*
 * Metodo encargado de solicitar la fecha en la que se desea realizar la consulta.
 * Se realizara un comprobacion de existn citas para ese dia, y se relizara un llamamiento al metodo encargado
 * de imprimir el informe con los campos especificados del paciente.
 * */
	private void imprimirCitasMedicas() throws Exception{
		
		System.out.println("Fecha de la Cita (dd-MM-yyyy): ");
		String fechaABuscar = sc.next();
		
		fi.ficheroInforme(fechaABuscar);
		
		
		
		
	}
	

}
