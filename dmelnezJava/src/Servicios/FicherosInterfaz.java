package Servicios;

public interface FicherosInterfaz {

	/*
	 * Metodo encargado de realizar la escritura de las acciones que realice el usuario dentro de la aplicacio, en un fichero log.
	 * Recibira como parametro un string(Accion realizara por el usuario), y lo escribira dentro del fichero.
	 * */
	public void ficheroLog(String mesajeLog);
	
	/*
	 * Metodo encargado de la escritura en un fichero de informes. El cual contendra todas las citas para cada cliente,
	 * el cual haya sido validado y tiene alguna cita, en un dia especificado.
	 * */
	public void ficheroInforme(String fechaABuscar);
	
	
}
