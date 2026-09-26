/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurabasica;

/**
 *
 * @author User
 */
public class EstructuraBasica {

    public static void main(String[] args) {
        
          String nombre = "Pepe";
         int edad = 36;
         double sueldo = 45000.50;
         boolean esEmpleado = true;
         
         //operaciones
         double salarioAnual = sueldo * 12;
         int edadProxima = edad+1;
         
         //salida
         System.out.println("Informacion");
         System.out.println("Nombre del empleado:  " + nombre);
         System.out.println("Edad: " + edad);
         System.out.println("Edad proxima: " + edadProxima);
         System.out.println("Sueldo; " + sueldo);
         System.out.println("Sueldo Anual: " + salarioAnual);
         System.out.println("Estado: " + esEmpleado);
         

    }
    
}
