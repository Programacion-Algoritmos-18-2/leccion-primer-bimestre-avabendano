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
public class EmpleadoFijo extends Empleado {

    private int sueldo_fijo;
    private double descuento_seguro;

    public EmpleadoFijo() {
        // Se llama al constructor de la clase padre
        super();
        this.sueldo_fijo = 0;
        this.descuento_seguro = 0;
    }

    // Metodos set
    public void agregar_sueldo_fijo(int sueldo_fijo) {
        this.sueldo_fijo = sueldo_fijo;
    }

    public void agregar_descuento_seguro(double descuento_seguro) {
        this.descuento_seguro = descuento_seguro;
    }

    // Metodos get
    public int obtener_sueldo_fijo() {
        return sueldo_fijo;
    }

    public double obtener_descuento_seguro() {
        return descuento_seguro;
    }

    // Calculamos el sueldo final: sueldo - (sueldo * descuento)
    public double calcular_sueldo_final() {
        return this.sueldo_fijo - (this.sueldo_fijo * (this.descuento_seguro / 100));
    }

    // Presentamos datos
    @Override
    public String presentar_datos() {
        String cadena = String.format("%s\nSueldo Fijo: %d\nDescuento: %.2f\nSueldo Final: %.2f", super.presentar_datos(), this.obtener_sueldo_fijo(), this.obtener_descuento_seguro(), this.calcular_sueldo_final());
        return cadena;
    }
}

