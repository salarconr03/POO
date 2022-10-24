/*
Name: LectorTemperatura1
Description: Leer y mostrar temperatura
Author: Sergio Fernando Alarcon Ruiz
*/
import java.util.Scanner;
class LectorTemperatura1{
	public static void main (String[] args){
		//Declarar variables
		double temperatura1;
		double temperatura2;
		double temperatura3;
		Scanner teclado = new Scanner(System.in);
		
		//Icializar variables
		temperatura1 = 0;
		temperatura1 = 0;
		temperatura1 = 0;
		
		//Leer temperatura
		System.out.println("Ingrese temperatura1");
		temperatura1 = teclado.nextDouble();
		System.out.println("Ingrese temperatura2");
		temperatura2 = teclado.nextDouble();
		System.out.println("Ingrese temperatura3");
		temperatura3 = teclado.nextDouble();
		
		//Mostrar temperatura
		System.out.println("Temperatura 1: " + temperatura1);
		System.out.println("Temperatura 2: " + temperatura2);
		System.out.println("Temperatura 3: " + temperatura3);
	}
}