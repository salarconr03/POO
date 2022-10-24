/*
Name: Calificaciones
Description: registra las calificaciones y calcula el promedio de un alumno.
Author: Sergio Fernando Alarcon Ruiz
 */
import java.util.Scanner;
class Calificaciones{
    public static void main(String[] args) {
        int n = 0;
        double promedio = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el numero de materias que tienes");
        n = entrada.nextInt();
        double [] calificaciones = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Ingresa la calificacion " + (i+1));
            calificaciones[i] =  entrada.nextDouble();
            if(calificaciones[i] > 10 || calificaciones[i] < 0 ){
                System.out.println("Por favor ingresa una calificacion valida");
            }else{
                promedio += calificaciones[i];
            }
        }

        promedio = promedio/n;
        System.out.println("Tu promedio es de " + promedio);
        
        if(promedio >= 9){
            System.out.println("Tienes un rendimiento excelente");
        } else if(promedio >= 8 && promedio < 9){
            System.out.println("Tienes un rendimiento bueno");
        } else if(promedio >= 6 && promedio < 8){
            System.out.println("Tienes un rendimiento regular");
        }else{
            System.out.println("Tienes un rendimiento insuficiente");
        }

        
    }
}