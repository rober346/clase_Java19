package ejerciciosDia19;

import java.util.Scanner;

public class menuComidas {
	
	public static void main (String [] args) {
				
		Scanner ent = new Scanner (System.in);
		System.out.println("********   MENU DEL DIA   ********");
		System.out.println("*** 1. Spaguetti a la Boloñesa ***");
		System.out.println("*** 2. Lassagna                ***");
		System.out.println("*** 3. Ravioles                ***");
		System.out.println("*** 4. Fetuchini               ***");
		System.out.println("*** 5. Macarrones con queso    ***");
		System.out.println("**********************************");
		int opcion = ent.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("Escogiste Spaguetti a la Boloñesa");
			break;
		case 2:
			System.out.println("Escogiste Lassagna");
			break;
		case 3:
			System.out.println("Escogiste Ravioles");
			break;
		case 4:
			System.out.println("Escogiste Fetuchini");
			break;
		case 5:
			System.out.println("Escogiste Macarrones con queso");
			break;
		default:
			System.out.println("xxx Escoge de nuevo xxx");
			break;
		}
	ent.close();
	}
}
