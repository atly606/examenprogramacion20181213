package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2 puntos
	 * 
	 * Crea en el método 'main' un juego que consista en generar de forma aleatoria
	 * un número entero comprendido entre 100 y 200 y pedirle al usuario que lo
	 * adivine. Para ello el programa le pedirá que introduza por teclado un número.
	 * Si introduce el número correcto se mostrará un mesaje por pantalla indicando
	 * que ha acertado acompañado del número de intentos realizados y del tiempo
	 * empleado. A continuación, se le dará al usuario la opción de volver a jugar o
	 * de finalizar el juego.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=(int)(Math.random()*200);
		int y=100;
		System.out.println("Entre 100-200, escribir un numero que quiere");
		while(x!=y) {
			y=sc.nextInt();
			if(y>x) {
				System.out.println("Mayor");
			}
			else if(y<x) {
				System.out.println("Menor");
				
			}
		}
            System.out.println("Bien! Numero correcto" + x);
            sc.close();
		}
		
		

	}


