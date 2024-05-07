package Servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import Controladores.Inicio;
import Dtos.CitaDtos;
import Dtos.PacienteDtos;

public class FicherosImplementacion implements FicherosInterfaz{

	
	public void ficheroLog(String mesajeLog) {
		
		LocalDate fecha = LocalDate.now();
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
					
		String ficheroLogRuta = "C:\\Users\\dmelnez\\Desktop\\log-" + fecha + ".txt";
		
		
		try {
			
			FileWriter escribir = new FileWriter(ficheroLogRuta, true);
			
	
			
			escribir.write(mesajeLog +"\n");
			
			escribir.close();
			
			
		} catch (IOException e) {
			System.out.println("[ALERTA] -> Se ha producido un error.");
		}
		
	}
	

	
	public void ficheroInforme(String fechaABuscar) {
		
	
		
		String ficheroLogRuta = "C:\\Users\\dmelnez\\Desktop\\Informe-"+ fechaABuscar + ".txt";
		
		
		try {
			
			FileWriter escribir = new FileWriter(ficheroLogRuta, true);
			
			
			
			for(CitaDtos cita : Inicio.listaCitas) {
				
				if(cita.getFechaCita().equals(fechaABuscar)) {
					
					System.out.println(cita.getDniPaciente());
					
					for(PacienteDtos paciente : Inicio.listaPacientes) {
						
						if (paciente.getDniCliente().equals(cita.getDniPaciente())) {
							
							System.out.println(paciente.getDniCliente() + ";" +  paciente.getApellidos() + ";" + paciente.getNombreCliente() +";" + cita.getEspecialidad());
						}
						
					}
				}
				
			}
			
			
			
			escribir.close();
			
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("[ALERTA] -> Se ha producido un error.");
			
			
		}
		
		
		
			
		} 
		

}
	

	

