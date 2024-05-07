package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{


	Scanner sc = new Scanner(System.in);
	
	public int menuPrincipal() {
		
		System.out.println("[0] -> Cerrar Aplicacion.");
		System.out.println("[1] -> Empleados.");
		System.out.println("[2] -> Clientes.");
		System.out.println("SELECCIONE UNA OPCION");

		int seleccionUsuario = sc.nextInt();
		return seleccionUsuario;
		
	}


	public int menuEmpleado() {
		System.out.println("[0] -> Subir al menu Principal.");
		System.out.println("[1] -> Validar Nuevo Cliente.");
		System.out.println("[2] -> Imprimir citas Medicas.");
		System.out.println("SELECCIONE UNA OPCION");

		int seleccionEmpleado = sc.nextInt();
		return seleccionEmpleado;
	}


	public int menuClientes() {
		System.out.println("[0] -> Subir al menu Principal.");
		System.out.println("[1] -> Registro de Cliente.");
		System.out.println("[2] -> Solicitud de Cita Medica");
		System.out.println("[3] -> Consulta de Citas Medicas");
		System.out.println("SELECCIONE UNA OPCION");

		int seleccionClientes = sc.nextInt();
		return seleccionClientes;
	}
	
	public int menuCitas() {
		System.out.println("[0] -> Subir al menu Principal.");
		System.out.println("[1] -> Psicologia.");
		System.out.println("[2] -> Traumatologia");
		System.out.println("[3] -> Fisioterapia");
		System.out.println("SELECCIONE UNA OPCION");

		int seleccionMenuCitas = sc.nextInt();
		return seleccionMenuCitas;
	}

}
