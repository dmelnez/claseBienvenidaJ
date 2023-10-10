package edu.menuClinica.servicios;

import java.util.Scanner;

/**
 * Interfaz encargada de la enumeracion de los Metods y las Funcionalidades del Menu
 */


public interface MenuInterfaz {
	
	/**
	 * Muestra el menu al usuario, y es la encargada de recoger el valor del usuario
	 * @author DMN - 03/10/2023
	 * @return	El numero de la Accion que selecciona el Usuario 
	 */
	
	 public int mostrarMenu(Scanner comunicacionTecladoM);

}
