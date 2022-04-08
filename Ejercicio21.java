package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		//ejercicio 21
//		String[] vector = {"Andrea","Juan","Pedro","Azul","Marcelo"};
//		for (String vec : vector) {
//			System.out.println(vec);
//		}
		
		//Ej 26
		
//		int [][] numeros = {{7,5,5,6},{6,8},{2,4}};
//		System.out.println("Cantidad de filas "+ numeros.length);
//		for(int i=0; i < numeros.length; i++) {
//			System.out.println("Fila "+ i + " tiene " + numeros[i].length + " elementos");
//		}
		
		//Ej28
		
		System.out.print("Carga al grado de la matriz: ");
		int n = Integer.parseInt(lector.nextLine());
		
		int[][] matriz = new int[n][n];
		
		for(int i=0; i<n;i++){
			for(int j=0; j<n;j++){
				System.out.print("Carga el numero de la fila "+ (i+1) +" columna "+ (j+1) +": " );
				matriz[i][j] = Integer.parseInt(lector.nextLine());
			}
		}
		int total=0;
		for(int i=0; i<n;i++){
			for(int j=0; j<n;j++){
				if(i==j) {
					total += matriz[i][j];
				}
			}
		}
		int totalSec=0;
		int j=(n-1);
		for(int i=0; i<n; i++){
			totalSec += matriz[i][j];
			j--;
		}
		
		System.out.println("la suma de la diagonal principal es: "+ total);
		System.out.println("la suma de la diagonal secundaria es: "+ totalSec);
		
		
		
		
			
		
	}
}
