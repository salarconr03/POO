import javax.sound.sampled.SourceDataLine;

/*
Name: Profesor
Description: Modela un profesor utilzando herencia
Author: Segio Fernando Alarcon Ruiz
*/
public class Profesor extends Persona{
    //Atributos
    private String numeroEmpleado;

    //Constructor
    public Profesor(){
        super();

    }

    //Getter y setter
    public String getNumeroEmpleado(){
        return this.numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado){
        this.numeroEmpleado = numeroEmpleado;
    }

    //Sobreescribir el metodo
    public String saludar(){
        //implementar metodo saludar
        //String mensaje = "Hola soy " + super.getNombre();
        //mensaje += " Mi edad es " + super.getEdad();
        String mensaje = super.saludar();
        mensaje += " Mi numero de empleado es " + this.getNumeroEmpleado();
        return mensaje;
    }

    //Sobrecargar el metodo saludar
    public String saludar(String saludo){
        String mensaje = this.saludar();
        mensaje += ". " + saludo;
        return mensaje;   
    }
}