package edu.claseBienvenidaJ.controladores;

import edu.claseBienvenidaJ.servicios.MenuInterfaz;
import edu.claseBienvenidaJ.servicios.MenuImplentacion;

/**
 * Clase Principal de la Funcion 
 * 26/09/2023 - DMN
 */

public class InicioAplicacion {

	/**
	 * Inicio de la Aplicacion
	 * 26/09/2023 - DMN
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuInterfaz mi = new MenuImplentacion ();
		
		mi.mostrarMensajeBienvenida(); //llamamiento al metodo que muestra el mensaje de bienvenida

	}

}
