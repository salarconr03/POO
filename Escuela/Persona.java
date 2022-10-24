/*
Name: Persona
Description: Modela una persona
Author: Sergio Fernando Alarcon Ruiz
*/
public class Persona{
    //Atributos
    public String nombre;
    public int edad;

    //Métodos
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