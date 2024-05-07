package Servicios;

public interface MenuInterfaz {

	/*
	 * Metodo encargado de imprimir el menu principal.
	 * Recogera la seleccion del usuarios, y lo devolvera al metodo Main.
	 * */
	public int menuPrincipal();
	
	/*
	 * Metodo encargado de imprimir el menu principal.
	 * Recogera la seleccion del usuarios, y lo devolvera al metodo del Empleado.
	 * */
	public int menuEmpleado();
	
	/*
	 * Metodo encargado de imprimir el menu principal.
	 * Recogera la seleccion del usuarios, y lo devolvera al metodo Cliente.
	 * */
	public int menuClientes();
	
	/*
	 * Metodo encargado de imprimir el menu principal.
	 * Recogera la seleccion del usuarios, y lo devolvera al metodo Cliente.
	 * */
	public int menuCitas();
	
}
