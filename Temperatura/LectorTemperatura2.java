/*
Name: LectorTemperatura1
Description: Leer y mostrar temperatura
Author: Sergio Fernando Alarcon Ruiz
*/

import java.util.Scanner;
class LectorTemperatura2{
	public static void main(String[] args){
		//Declarar variables
		double[] temperatura;
		temperatura = new double[3];
		Scanner teclado = new Scanner(System.in);
		
		//Leer temperatura
		System.out.println("Ingrese temperatura1");
		temperatura[0] = teclado.nextDouble();
		System.out.println("Ingrese temperatura2");
		temperatura[1] = teclado.nextDouble();
		System.out.println("Ingrese temperatura3");
		temperatura[2] = teclado.nextDouble();
		
		//Mostrar temperatura
		System.out.println("Temperatura 1: " + temperatura[0]);
		System.out.println("Temperatura 2: " + temperatura[1]);
		System.out.println("Temperatura 3: " + temperatura[2]);
	}
}