/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopersonasw;

import java.io.Serializable;

/**
 *
 * @author Alumno
 */
public class Persona implements Serializable {
    private String nombre;
    private int NumCta;
    private double saldoInicial;

    public Persona() {
    }

    public Persona(String nombre, int NumCta, double saldoInicial) {
        this.nombre = nombre;
        this.NumCta = NumCta;
        this.saldoInicial = saldoInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCta() {
        return NumCta;
    }

    public void setNumCta(int NumCta) {
        this.NumCta = NumCta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
    
    
}
