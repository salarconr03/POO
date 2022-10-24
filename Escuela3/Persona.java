/*
Name: Persona
Description: Modela una persona utilizando encapsulamiento
Author: Sergio Fernando Alarcon Ruiz
*/
public class Persona{
    //Atributos
    private String nombre;
    private int edad;

    //Métodos
    //Constructores
    public Persona(){

    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getter & Setters
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    //Otros metodos
    public String leer(){
    //Implementar el método
    String mensaje = "Estoy leyendo";
    return mensaje;  
    }

    public String saludar(){
        //Implementar método saludar
        String mensaje = "Hola soy: " + nombre;
        mensaje += ". Mi edad es: " + edad;
		//mensaje = mensaje + "..."+
        return mensaje;
    }
}