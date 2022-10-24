/*
Name: LectorTemperatura1
Description: Leer y mostrar temperatura
Author: Sergio Fernando Alarcon Ruiz
*/

import java.util.Scanner;
class LectorTemperatura3{
	public static void main(String[] args){
		//Declarar variables
		double[] temperatura;
		temperatura = new double[5];
		Scanner teclado = new Scanner(System.in);
		
		//Leer temperatura
		for(int i = 0; i < 5; i++){
		System.out.println("Ingrese temperatura " + (i+1));
		temperatura[i] = teclado.nextDouble();
		}
		
		//mostrar temperaturas
		for(int i = 0; i< 5; i++){
			System.out.println("Temperatura " + (i+1) + ": " + temperatura[i]);
		}
	}
}