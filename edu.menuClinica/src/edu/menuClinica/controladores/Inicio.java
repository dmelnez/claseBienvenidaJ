package edu.menuClinica.controladores;

import java.util.Scanner; /*CNTRL + SHIFT + O */

import edu.menuClinica.servicios.MenuImplementacion;
import edu.menuClinica.servicios.MenuInterfaz;

/**
 * Clase por la que se Accede a la Aplicacion
 * 29/09/2023
 * @author DMN
 */

public class Inicio {
	
	/**
	 * Metodo Principal de por la que empieza la Aplicacion. Ejecuta las ordenes que se le especifiquen
	 * 20/09/2023
	 * @author DMN
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int seleccionUsuario; 
		boolean cierraMenu = false ;
		Scanner comunicacionTeclado = new Scanner (System.in); /*Realiza lo mismo que ReadKey en C#*/
		MenuInterfaz mi = new MenuImplementacion ();
		
		while (!cierraMenu) {
			
			seleccionUsuario = mi.mostrarMenu(comunicacionTeclado);
			
			switch(seleccionUsuario) {
			
			
				case 0:
					System.out.println("[INFO] - Se Ejecuta Caso 0");
					cierraMenu = true;
					break;
				case 1:
					System.out.println("[INFO] - Se Ejecuta Caso 1");
					break;
				case 2:
					System.out.println("[INFO] - Se Ejecuta Caso 2");
					break;
				case 3:
					System.out.println("[INFO] - Se Ejecuta Caso 3");
					break;
				case 4:
					System.out.println("[INFO] - Se Ejecuta Caso 4");
					break;
				case 5:
					System.out.println("[INFO] - Se Ejecuta Caso 5");
					break;
				default:
					System.out.println(" [INFO] - Vuelva a Seleccionar una opcion");
						break;
				
			
			}
		}
	}

}
