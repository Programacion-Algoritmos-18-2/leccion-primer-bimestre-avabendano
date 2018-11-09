/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.Scanner;
import mipaquete.Empleado;
import mipaquete.EmpleadoFijo;
import mipaquete.EmpleadoPorHoras;

/**
 *
 * @author Victoria
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Utilizacion de la clase Padre Empleado
        Empleado e = new Empleado();
        e.agregar_nombre("Luis");
        e.agregar_apellido("Benitez");
        e.agregar_cedula("1956523544");
        
        System.out.println(e.presentar_datos());
        
        // -------------
        System.out.println("\n");
        
        // Utilizacion de la clase Hija EmpleadoPorHoras
        EmpleadoPorHoras e1 = new EmpleadoPorHoras();
        System.out.printf("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        e1.agregar_nombre(nombre);
        e1.agregar_apellido("Andrade");
        e1.agregar_cedula("112233");
        e1.agregar_numero_horas(202);
        e1.agregar_valor_hora(15);
        
        System.out.println(e1.presentar_datos());
        
        // -------------
        System.out.println("\n");
        
        // Utilizacion de la clase Hija EmpleadoFijo
        EmpleadoFijo e2 = new EmpleadoFijo();
        e2.agregar_sueldo_fijo(3002);
        e2.agregar_descuento_seguro(10);
        System.out.printf("Ingresa comision: ");
        double comision = entrada.nextDouble();
        e2.agregar_comision_fija(comision);
        e2.nombre = "Ana";
        e2.apellido = "Diaz";
        
        System.out.println(e2.presentar_datos());
    }

}
