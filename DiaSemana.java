package ejerciciosDia19;

import java.util.Scanner;

public class DiaSemana {
	
	public static void main (String [] args) {
		
		Scanner ent = new Scanner (System.in);
		System.out.println("*** INGRESA UN NUMERO DEL 1 AL 7 SEGUN EL DIA DE LA SEMANA ***");
		int opcion = ent.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("El Dia de la semana es DOMINGO");
			break;
		case 2:
			System.out.println("El Dia de la semana es LUNES");
			break;
		case 3:
			System.out.println("El Dia de la semana es MARTES");
			break;
		case 4:
			System.out.println("El Dia de la semana es MIERCOLES");
			break;
		case 5:
			System.out.println("El Dia de la semana es JUEVES");
			break;
		case 6:
			System.out.println("El Dia de la semana es VIERNES");
			break;
		case 7:
			System.out.println("El Dia de la semana es SABADO");
			break;		
		default:
			System.out.println("xxxx NUMERO INCORRECTO xxxx");
			break;
		}
		
	ent.close();
	}

}
