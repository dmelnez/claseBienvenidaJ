package edu.menuClinica.servicios;

import java.util.Scanner;

/**
 * Implementacion de la Interfaz Menu
 * 06/10/2023
 */

public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenu(Scanner comunicacionTecladoM) {
		
		int opcionSeleccionada;
		
		System.out.println("########################################");
		System.out.println("########### MENU DE SELECCION ##########");
		System.out.println("########################################");
		System.out.println("# 0. Cerrar la Aplicacion              #");
		System.out.println("# 1. Registro de Paciente              #");
		System.out.println("# 2. Ingreso de Paciente               #");
		System.out.println("# 3. Alta de Paciente                  #");
		System.out.println("# 4. Resumen de Ingresos y Altas       #");
		System.out.println("# 5. Historial del Paciente            #");
		System.out.println("########################################");
		System.out.println("          Seleccione una Opcion         ");
		System.out.println("########################################");

		opcionSeleccionada = comunicacionTecladoM.nextInt();
		
		return opcionSeleccionada;
	}

}
