/*
Name: Figuras
Description: Calcular el area y el perimetro de varias figuras
Author: Sergio Fernando Alarc�n Ruiz
*/

import java.util.Scanner;
class Figuras {
	public static void main(String[] args){
		double base;
		double altura;
		int figuras;
		int lado;
		int ladoa;
		int ladob;
		int radio;
		final double pi = 3.14;
		Scanner scanner;
		scanner = new Scanner(System.in);

		System.out.println("Con que figura quieres trabajar:");
		System.out.println("Rectangulo: 1");
		System.out.println("Cuadrado: 2");
		System.out.println("Triangulo: 3");
		System.out.println("Circulo: 4");
		figuras = scanner.nextInt();

		if(figuras == 1){
			System.out.println("Introduce la base: ");
		    base = scanner.nextInt();
		
		    System.out.println("Introduce la altura: ");
		    altura = scanner.nextInt();
		
		    System.out.println("El area es: " + base * altura + " y el perimetro es: " + 2 * (base + altura));
		}

		if(figuras == 2){
			System.out.println("Introduce un lado: ");
		    lado = scanner.nextInt();
		
		    System.out.println("El area es: " + lado * lado + " y el perimetro es: " + 4 * lado);
		}

		if(figuras == 3){
			System.out.println("Introduce la base: ");
		    base = scanner.nextInt();
		
		    System.out.println("Introduce la altura: ");
		    altura = scanner.nextInt();

			System.out.println("Introduce los dos lados restantes: ");
		    ladoa = scanner.nextInt();
			ladob = scanner.nextInt();

			System.out.println("El area es: " + (base * altura) / 2 + " y el perimetro es: " + (base + ladoa + ladob));
		}

		
		if(figuras == 4){
			System.out.println("Introduce el radio: ");
		    radio = scanner.nextInt();
		
		    System.out.println("El area es: " + pi * (radio * radio) + " y el perimetro es: " + pi * (2 * radio));
		}
		
	}
}

