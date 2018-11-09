/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mipaquete;

/**
 *
 * @author Victoria
 */
// Clase Padre Empleado
public class Empleado {

    public String nombre;
    public String apellido;
    private String cedula;
    private double comision_fija;

    // Constructor de Clase Empleado
    public Empleado() {
        this.nombre = "";
        this.apellido = "";
        this.cedula = "";
        this.comision_fija = 0;
    }

    // Metodos set
    public void agregar_nombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregar_apellido(String apellido) {
        this.apellido = apellido;
    }

    public void agregar_cedula(String cedula) {
        this.cedula = cedula;
    }

    public void agregar_comision_fija(double comision_fija) {
        this.comision_fija = comision_fija;
    }

    // Metodos get
    public String obtener_nombre() {
        return nombre;
    }

    public String obtener_apellido() {
        return apellido;
    }

    public String obtener_cedula() {
        return cedula;
    }

    public double obtener_comision_fija() {
        return comision_fija;
    }

    // Metodo para presentar datos
    public String presentar_datos() {
        String cadena = String.format("Información de %s %s\n\tCedula %s", this.obtener_nombre(), this.obtener_apellido(), this.obtener_cedula());
        return cadena;
    }
}

