/*
Name: Edad1
Description: Escribe si es mayor o menor de edad.
Author: Sergio Fernando Alarcón Ruiz
*/
//Final double = constante

import java.util.Scanner;
class Edad3{
	public static void main(String[] args){
		//Input
		int edad;	
		Scanner scanner;
		scanner = new Scanner(System.in);
		String mensaje = "";
		
		//Process
		System.out.println("Introduce tu edad: ");
		edad = scanner.nextInt();
			if(edad >= 18 && edad < 130){
				mensaje = "Eres mayor de edad.";
			} else if(edad > 0 && edad < 18) {
				mensaje = "Eres menor de edad.";
			} else if (edad <= 0 ){
				mensaje = "No existes";
			} else{
				mensaje = "Ya estas del otro lado";
			}	
		
		//Output
		System.out.println(mensaje);

 	} 
}