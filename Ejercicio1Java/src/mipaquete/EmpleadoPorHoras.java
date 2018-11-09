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
public class EmpleadoPorHoras extends Empleado {

    private int numero_horas;
    private double valor_hora;

    public EmpleadoPorHoras() {
        // Se llama al constructor de la clase padre
        super();
        this.numero_horas = 0;
        this.valor_hora = 0;
    }

    // Metodos set
    public void agregar_numero_horas(int numero_horas) {
        this.numero_horas = numero_horas;
    }

    public void agregar_valor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }

    // Metodos get
    public int obtener_numero_horas() {
        return numero_horas;
    }

    public double obtener_valor_hora() {
        return valor_hora;
    }

    // Calculamos el sueldo final: horas * su valor
    public double calcular_sueldo_final() {
        return this.numero_horas * this.valor_hora;
    }

    // Presentamos datos
    @Override
    public String presentar_datos() {
        String cadena = String.format("%s\nNumero horas: %d\nValor hora: %.2f\nSueldo Final: %.2f", super.presentar_datos(), this.obtener_numero_horas(), this.obtener_valor_hora(), this.calcular_sueldo_final());
        return cadena;
    }

    public void calcular_valor_sueldo() {
        System.out.println(this.numero_horas);
        System.out.println(this.obtener_valor_hora());
        System.out.println(this.obtener_comision_fija());
    }
}

