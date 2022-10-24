/*
 * Name: Agencia
 * Description: Registra las caracteristicas de un vehiculo
 * Author: Sergio Fernando Alarcon Ruiz
 */
import java.util.Scanner;
public class Agencia {
    public static void main(String[] args) {
        Automovil carro = new Automovil();
        Camioneta camioneta = new Camioneta();
        int op;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa eltipo de vehiculo que desea registrar");
        System.out.println("1. Automovil");
        System.out.println("2. Camioneta");
        op = entrada.nextInt();

        switch(op){
            case 1:
                carro.mostrarDatos();
                break;
            case 2:
                camioneta.mostrarDatos();
                break;
        }
    }
}
