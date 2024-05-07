package Controladores;

import java.util.ArrayList;
import java.util.List;

import Dtos.CitaDtos;
import Dtos.PacienteDtos;
import Servicios.ClienteImplementacion;
import Servicios.ClienteInterfaz;
import Servicios.EmpleadosImplementacion;
import Servicios.EmpleadosInterfaz;
import Servicios.FicherosImplementacion;
import Servicios.FicherosInterfaz;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;


/*
 * Clase principal por la cual se inicializa la aplicacion,
 * */
public class Inicio {

	
/*
 * Declaracion de una lista de pacientes y citas de manera estatica
 * */
	public static List<CitaDtos> listaCitas = new ArrayList<CitaDtos>();

	public static List<PacienteDtos> listaPacientes = new ArrayList<PacienteDtos>();
	
/*
 * Metodo por el cual la aplicacion se lanzara. 
 * El metodo realizara llamamientos a otros metodos, en funcion de la seleccion del menu del usuario.
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MenuInterfaz me = new MenuImplementacion();
		
		FicherosInterfaz fi = new FicherosImplementacion();
		
		ClienteInterfaz cli = new ClienteImplementacion();
		
		EmpleadosInterfaz emp = new EmpleadosImplementacion();
				
		String mensajeLog;
		
		boolean esCerrar = false;
		
			
	try {
		
	
		
		do {
			
			int seleccionMenuPrincipal = me.menuPrincipal();
			
			switch(seleccionMenuPrincipal) {
			
			case 0:
				System.out.println("[INFO] -> Se cerrara la Aplicacion");
				mensajeLog = "Se cerrara la Aplicacion";
				fi.ficheroLog(mensajeLog);
				esCerrar = true;
				
				break;
				
			case 1:
				System.out.println("[INFO] -> Version Empleados");
				mensajeLog = "Acceso a Version Empleados";
				fi.ficheroLog(mensajeLog);
				emp.menuEmpleados();

				break;
			
			case 2:
				System.out.println("[INFO] -> Version Clientes");
				mensajeLog = "Acceso a Version Clientes";
				fi.ficheroLog(mensajeLog);
				cli.menuClientes();
			
				
				break;
				
			default:
				break;
			
			
			}
			
			
			
		}
		
		while(!esCerrar);
		
	}
	
	catch (Exception e) {
		System.out.println("[ALERTA] -> Se ha producido un Error.");
		mensajeLog = e.toString();
	}
		
	}

}
