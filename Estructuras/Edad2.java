/*
Name: Edad1
Description: Escribe si es mayor o menor de edad.
Author: Sergio Fernando Alarcón Ruiz
*/
//Final double = constante

import java.util.Scanner;
class Edad2{
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
			} else {
				mensaje = "Eres menor de edad.";
			}	
		
		//Output
		System.out.println(mensaje);

 	} 
}