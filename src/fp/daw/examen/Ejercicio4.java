package fp.daw.examen;

import java.util.Random;

public class Ejercicio4 {

	/* 
	 * 2 puntos
	 * 
	 * Define, después de este comentario, un método llamado 'numSecuencias' que
	 * reciba en un parámetro formal un vector de números enteros y retorne el 
	 * número de secuencias de números repetidos. Ejemplo, si el contenido del vector es:
	 * 	
	 * 		[9,2,2,3,2,5,7,7,7,4]
	 * 		   * *       * * * 
	 * 
	 * el método retornará el valor 2 ya que contiene las dos secuencias de números
	 * repetidos que se han señalado con los asteriscos.
	 * 
	 */
	
	public static void main1(String[] args) {
		int[] array= {9,2,2,3,2,5,7,7,7,4};
		for (int i: array) {
			System.out.println(i);
		}
	}
	
	/*
	 * 1 punto
	 * 
	 * Escribe en el método main las sentencias necesarias para crear un vector de números
	 * enteros de un tamaño aleatorio entre 10 y 100 y llenarlo con números enteros
	 * aleatorios comprendidos entre -100 y 100. A continuación se mostrará su contendio por 
	 * pantalla invocando al método 'mostrarVector' definido en el ejercicio 1 y el número
	 * de secuencias de números repetidos que contiene invocando al método 'numSecuencias'.
	 *  
	 */
	
	public static void main(String[] args) {
		int n =10;
		int[] array= new int[n];Random r= new Random(100);
		array[0]=0;
		for(int i=0; i<100;i++) {
			array[i]=r.nextInt(100)+1;
			for (int j=0; j<i;j++) {
				if(array[i]==array[j]) {
					i--;
					break;
				}
			}
		}

	
           for(int i=0;i<100;i++) {
        	   System.out.println(array[i]+"");
           }
	}
}
