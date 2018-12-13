package fp.daw.examen;

import java.util.Random;

public class Ejercicio1 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'mostrarVector' que
	 * reciba mediante un parámetro formal un vector de números enteros y lo muestre por
	 * pantalla en una única línea con el formato siguiente:
	 * 
	 * 				[num1, num2, num3, ...., numN]
	 * 
	 * donde num1, num2, num3, ..., numN son los números almacenados en el vector.
	 */
	
	public static void main(String[] args) {
	   Random rm=new Random();
	   int i=0;
	   int n,num;
	   int vector[]=new int[1];
	   for (i=0;i<vector.length;i++) {
		   num=rm.nextInt(n);
		   vector[i]=num;
	   }
	   System.out.println("Imprimiendo vector");
	   for (i=0;i<vector.length;i++) {
		   System.out.println(i+"=["+vector[i]+"]");
	   }
	
	}
	
	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, la vesión sobrecargada del método anterior que
	 * muestre por pantalla un vector de caracteres con el formato siguiente:
	 * 
	 * 				['c1', 'c2', 'c3', ...., 'cN']
	 * 
	 * donde 'c1', 'c2', 'c3', ...., 'cN' son los caracteres almacenados en el vector.
	 */

	public static void main1(String[] args) {
		   Random rm=new Random();
		   int i=1;
		   int n,cN;
		   int vector[]=new int[1];
		   for (i=0;i<vector.length;i++) {
			   cN=rm.nextInt(n);
			   vector[i]=cN;
		   }
		   System.out.println("Imprimiendo vector");
		   for (i=0;i<vector.length;i++) {
			   System.out.println(i+"=["+vector[i]+"]");
		   }
		
		}