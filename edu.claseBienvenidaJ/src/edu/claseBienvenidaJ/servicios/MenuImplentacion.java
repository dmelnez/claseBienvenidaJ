package edu.claseBienvenidaJ.servicios;

/**
 * Implementacion de la Interfaz
 */

public class MenuImplentacion implements MenuInterfaz {
	
	/**
	 * Metodo que imprime po pantalla el mensaje bienvenida
	 * 26/09/2023 - DMN
	 */

	@Override //sobrescritura | overload = sobrecarga
	public void mostrarMensajeBienvenida() {
		// TODO Auto-generated method stub
		
		String mensaje = "Clinica CSI1";
		
		System.out.println(mensaje); 
		//system.out : Controla el flujo de salida | println : Imprime de forma continua | print : Imprime de forma con un salto de linea
		//system.in : Controla el flujo de entrada
		
	}

}
