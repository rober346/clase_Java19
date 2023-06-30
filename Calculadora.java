package ejerciciosDia19;

import java.util.Scanner;

public class Calculadora {
	
	public static void main (String [] args){
		
		Scanner ent = new Scanner (System.in);
		System.out.println("********   CALCULADORA    ********");
		System.out.println("*** 1. SUMA                    ***");
		System.out.println("*** 2. RESTA                   ***");
		System.out.println("*** 3. MULTIPLICACION          ***");
		System.out.println("*** 4. DIVSION                 ***");
		System.out.println("*** 5. POTENCIA                ***");
		System.out.println("**********************************");
		int opcion = ent.nextInt();
		
		switch (opcion) {
		case 1:
	
			System.out.println("Introduce 1 numero para sumar......:");
			int op1 = ent.nextInt();
			System.out.println("Introduce otro numero para sumar......:");
			int op2 = ent.nextInt();
			CalcSuma.sumando(op1, op2);
			break;
		case 2:
			System.out.println("Introduce 1 numero para restar......:");
			int op3 = ent.nextInt();
			System.out.println("Introduce otro numero para restar......:");
			int op4 = ent.nextInt();
			CalcResta.restando(op3, op4);
			break;
		case 3:
			System.out.println("Introduce 1 numero para multiplicar......:");
			int op5 = ent.nextInt();
			System.out.println("Introduce otro numero para multiplicar......:");
			int op6 = ent.nextInt();
			CalcMultiplicacion.multiplicando(op5, op6);
			break;
		case 4:
			System.out.println("Introduce 1 numero para dividir......:");
			int op7 = ent.nextInt();
			System.out.println("Introduce otro numero como dividendo......:");
			int op8 = ent.nextInt();
			CalcDivision.dividiendo(op7, op8);
			break;
		case 5:
			System.out.println("Introduce 1 numero para potenciar......:");
			int op9 = ent.nextInt();
			System.out.println("Introduce otro numero como exponente......:");
			int op10 = ent.nextInt();
			CalcPotencia.potenciando(op9, op10);
			break;
		default:
			break;
		}
	    
	ent.close();		    
	}
		
}

