import java.util.Scanner;
class Conversor{
	public static void main(String[] args){
		//Declarar variables
		Scanner teclado;
		double pies;
		int opcion;
		double pulgadas;
		double yardas;
		double centimetros;
		double metros;
		char continuar;
		continuar = 'S';
		while(continuar == 'S'){
			//Inicializar variables
			teclado = new Scanner(System.in); 
			pies = 0;
			opcion = 0;
			pulgadas = 0;
			yardas = 0;
			centimetros = 0;
			metros = 0;
			
			
			System.out.println("Introduce el valor en pies: ");
			pies = teclado.nextDouble();
		
			System.out.println("Elige una opcion: ");
			System.out.println("1. Pulgadas");
			System.out.println("2. Yardas");
			System.out.println("3. Centimetros");
			System.out.println("4. Metros");
			opcion = teclado.nextInt();
			
			switch(opcion){
				case 1:
					pulgadas = pies * 12;
					System.out.println("Pulgadas: " + pulgadas);
					break;
				case 2:
					yardas = pies / 3;
					System.out.println("Yardas: " + yardas);
					break;
				case 3:
					centimetros = pies * 30.48;
					System.out.println("Centimetros: " + centimetros);
					break;
				case 4:
					metros = pies / 3.281;
					System.out.println("Metros: " + metros);
					break;	
			}
			
			System.out.println("Desea continuar? (S/N)");
			continuar = teclado.next().charAt(0);
		}
	}
}