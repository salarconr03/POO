/*
Name: Edad1
Description: Escribe si es mayor de edad.
Author: Sergio Fernando Alarcón Ruiz
*/

import java.util.Scanner;
class Edad1{
	public static void main(String[] args){
		//Input
		int edad;
		Scanner scanner;
		scanner = new Scanner(System.in);
		String mensaje = "";
		
		//Process
		System.out.println("Introduce tu edad: ");
		edad = scanner.nextInt();
				if(edad >= 18){
			mensaje = "Eres mayor de edad.";
		}	
		
		//Output
		System.out.println(mensaje);

 	} 
}