package Servicios;

import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import Controladores.Inicio;
import Dtos.CitaDtos;
import Dtos.PacienteDtos;



public class ClienteImplementacion implements ClienteInterfaz{

	Scanner sc = new Scanner(System.in);
	
	MenuInterfaz me = new MenuImplementacion();
	
	FicherosInterfaz fi = new FicherosImplementacion();
	
	String ficheroLogCliente;

	
	public void menuClientes() {
		
	try {
		
	
		boolean esCerrarCliente = false;
	
		do {
			
			int seleccionMenuPrincipal = me.menuClientes();
			
			switch(seleccionMenuPrincipal) {
			
			case 0:
				System.out.println("[INFO] -> Cerrar Menu");
				ficheroLogCliente = "Se cerrara el Menu Cliente";
				fi.ficheroLog(ficheroLogCliente);
				esCerrarCliente = true;
				
				break;
				
			case 1:
				System.out.println("[INFO] -> Registro de Clientes");
				ficheroLogCliente = "Registro de Clientes.";
				fi.ficheroLog(ficheroLogCliente);
				
				registroCliente();
				esCerrarCliente = true;

				break;
			
			case 2:
				System.out.println("[INFO] -> Solicitud de Cita Medica");
				ficheroLogCliente = "Acceso a Solicitud de Cita Medica";
				fi.ficheroLog(ficheroLogCliente);
				solicitudCita();
				esCerrarCliente = true;

				break;
				
			case 3:
				System.out.println("[INFO] -> Consulta de Citas Medicas");
				ficheroLogCliente = "Acceso a Consulta de Citas Medicas";
				fi.ficheroLog(ficheroLogCliente);
				consultaCitas();
				esCerrarCliente = true;

				break;
				
			default:
				break;
			
			
			}
					
			
		}
		
		while(!esCerrarCliente);
	}
	
	
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("[ALERTA] -> Se ha producido un Error.");
		ficheroLogCliente = e.toString();
		
	}
	
	}

	
	
/*
 * Metodo encargado de solicitar el cliente sus datos, y añadirlo a la lista de pacientes.
 * */
	private void registroCliente() throws Exception {
		
		PacienteDtos nuevoPaciente = new PacienteDtos();
		
		nuevoPaciente.setId(idGenerado());
		
		System.out.println("DNI: ");
		nuevoPaciente.setDniCliente(sc.next());
		
		
		System.out.println("Nombre: ");
		nuevoPaciente.setNombreCliente(sc.next());
		
		
		System.out.println("Apellidos: ");
		nuevoPaciente.setApellidos(sc.next());

		Inicio.listaPacientes.add(nuevoPaciente);
		
		ficheroLogCliente = "Se ha dado de alta un nuevo Paciente";
		fi.ficheroLog(ficheroLogCliente);
		
		
	}
	
	/*
	 * Metodo encargado de la generacion de un id nuevo, para cada paciente.
	 * El metod recoge el ultimo valor de tamaño de lista, en el campo id, y le suma 1.
	 * Si este valor, es 0, se asigna un valor de 1;
	 * */
	private long idGenerado() {
		
		long id = 0;
		
		int tamanioList = Inicio.listaPacientes.size();
		
		if(tamanioList <=0) {
			
			id = 1;
		}
		
		else {
			
			id = Inicio.listaPacientes.get(tamanioList -1).getId() +1;;
			
		}
		
		return id;
		
		
		
	}
	

/*
 * Metodo encargado de solicitar el cliente su DNI. El metodo validara si esta validado y si existe.
 * Mostrara al Cliente, todas las citas que puede solicitar, y el dia y hora en la que la solicita.
 * */
	private void solicitudCita() throws Exception{
		
		String departamentoMedico;
		
		System.out.println("DNI: ");
		String dniCitas = sc.next();

		for(PacienteDtos pacintes : Inicio.listaPacientes) {
			
			if(pacintes.getDniCliente().equals(dniCitas) && pacintes.getEsValidado() == true) {
				
				boolean esCerrarCliente = false;

				try {
					
				
				
					do {
						
						CitaDtos nuevaCita = new CitaDtos();
						
						int seleccionMenuPrincipal = me.menuCitas();
						
						switch(seleccionMenuPrincipal) {
						
						case 0:
							System.out.println("[INFO] -> Cerrar Menu");
							ficheroLogCliente = "Se cerrara el Menu Citas";
							fi.ficheroLog(ficheroLogCliente);
							
							esCerrarCliente = true;
							
							break;
							
						case 1:
							System.out.println("[INFO] -> Psicologia");
							ficheroLogCliente = "Cita para Psicologia.";
							departamentoMedico = "Psicologia";
							fi.ficheroLog(ficheroLogCliente);
							System.out.println("Fecha de Citas (dd/MM/yyyy HH:mm:ss)");
							//LocalDateTime fechaCitaPsicologia = LocalDateTime.parse(sc.next());
							String fechaCitaPsicologia = sc.next();
	
							
							nuevaCita.setFechaCita(fechaCitaPsicologia);
							nuevaCita.setEspecialidad(departamentoMedico);
							nuevaCita.setDniPaciente(dniCitas);
							
	
							esCerrarCliente = true;
	
							break;
						
						case 2:
							System.out.println("[INFO] -> Traumatologia");
							ficheroLogCliente = "Cita para Traumatologia.";
							departamentoMedico = "Traumatologia";
							fi.ficheroLog(ficheroLogCliente);
							System.out.println("Fecha de Citas (dd/MM/yyyy HH:mm:ss)");
							String fechaCitaTraumatologia = sc.next();
	
							
							nuevaCita.setFechaCita(fechaCitaTraumatologia);
							nuevaCita.setEspecialidad(departamentoMedico);
							nuevaCita.setDniPaciente(dniCitas);
	
							esCerrarCliente = true;
	
							break;
							
						case 3:
							System.out.println("[INFO] -> Fisioterapia");
							ficheroLogCliente = "Cita para Fisioterapia.";
							departamentoMedico = "Fisioterapia";
							fi.ficheroLog(ficheroLogCliente);
							System.out.println("Fecha de Citas (dd/MM/yyyy HH:mm:ss)");
							String fechaCitaFisioterapia = sc.next();
						
							
							nuevaCita.setFechaCita(fechaCitaFisioterapia);
							nuevaCita.setEspecialidad(departamentoMedico);
							nuevaCita.setDniPaciente(dniCitas);
							
							esCerrarCliente = true;
	
							break;
							
						default:
							break;
							
						
						
						}
						Inicio.listaCitas.add(nuevaCita);
		
						
					}
					
					while(!esCerrarCliente);
					
				}
				
				
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("[ALERTA] -> Se ha producido un Error.");
					ficheroLogCliente = e.toString();
					
				}
			}
			
			
		}
		
		
		
		
		
		
	}

	


/*
 * Metodo encargado de solicitar al cliente su dni, fecha inicio y fecha fin.
 * En base a estos datos, se realizara una busqueda de las citas, y se mostrara las que se encuentres en dicho rango.
 * */
	private void consultaCitas() throws Exception{
	
		System.out.println("DNI: ");
		String dniABuscar = sc.next();
		
		System.out.println("Fecha Inicio: (dd-MM-yyyy)");
		String fechaInicio = sc.next();
		
		System.out.println("Fecha Fin: (dd-MM-yyyy)");
		String fechaFin = sc.next();
		
		for(CitaDtos cita: Inicio.listaCitas) {
		
			
			if(cita.getDniPaciente().equals(dniABuscar) && fechaInicio > cita.getFechaCita() && fechaFin < cita.getFechaCita()) {
				
				System.out.println(cita.getFechaCita() +" " + cita.getEspecialidad());
			}
			
		}

		
	}



}
