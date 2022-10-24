/*
 * Name: Agencia
 * Description: Registra las caracteristicas de un vehiculo
 * Author: Sergio Fernando Alarcon Ruiz
 */
import java.util.Scanner;
public class Vehiculo {
    private String placas;
    private int puertas;
    private String color;
    private String marca;
    private double precio;
    Scanner entrada = new Scanner(System.in);

    public Vehiculo(){

    }

    public Vehiculo(String placas, int puertas, String color, String marca, double precio){
        this.placas = placas;
        this.puertas = puertas;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }

    public String getPlacas(){
        return this.placas;
    }

    public void setPlacas(String placas){
        this.placas = placas;
    }

    public int getPuertas(){
        return this.puertas;
    }

    public void setPuertas(int puertas){
        this.puertas = puertas;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void mostrarDatos(){
        System.out.println("Introduce las placas de tu vehiculo");
        placas = entrada.next();
        System.out.println("Introduce el numero de puertas de tu vehiculo");
        puertas = entrada.nextInt();
        System.out.println("Introduce el color de tu vehiculo");
        color = entrada.next();
        System.out.println("Introduce la marca de tu vehiculo");
        marca = entrada.next();
        System.out.println("Introduce el precio de tu vehiculo");
        precio = entrada.nextDouble();
        

        System.out.println("Las placas de tu vehiculo son: " + placas);
        System.out.println("El numero de puertas de tu vehiculo son: " + puertas);
        System.out.println("El color de tu vehiculo es: " + color);
        System.out.println("La marca de tu vehiculo es: " + marca);
        System.out.println("El precio de tu vehiculo es: $" + precio);
    }
}
