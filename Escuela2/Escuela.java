public class Escuela{
    public static void main(String[] args){
        //Implementar el método main

        //Declarar variables
        Persona persona1;
        Persona persona2;
        Profesor profesor1;

        //Asignar valor a las variables
        //Crear objeto o instanciar
        persona1 = new Persona();
        persona2 = new Persona("Carlos", 60);
        profesor1 = new Profesor();

        //Acceder a los atributos
        persona1.setNombre("Filiberto");
        persona1.setEdad(32);

        profesor1.setNombre("Elizabeth");
        profesor1.setEdad(96);

        System.out.println( persona1.saludar());
        System.out.println( persona2.saludar());
        System.out.println( profesor1.saludar());
    }
}