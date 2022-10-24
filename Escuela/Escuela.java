public class Escuela{
    public static void main(String[] args){
        //Implementar el método main

        //Declarar variables
        Persona persona1;

        //Asignar valor a las variables
        //Crear objeto o instanciar
        persona1 = new Persona();

        //Acceder a los atributos
        persona1.nombre = "Sergio";
        persona1.edad = 32;

        System.out.println( persona1.saludar());
    }
}