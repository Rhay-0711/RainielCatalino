/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MAIN {
    
public static void main(String[] args) {
        
        // Se crea la calculadora y el scanner para leer lo que escribe el usuario
        CalculadoraMatematica calculadora = new CalculadoraMatematica();
        Scanner sc = new Scanner(System.in);
        
        // Guarda la opcion que elige el usuario en el menu
        int opcionMenu;
        
        // El menu se repite hasta que el usuario elija salir
        do {
            
            // Se muestra el menu
            System.out.println("==== CALCULADORA MATEMATICA ====");
            System.out.println("1. Ingresar numero");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.println("=======================================");
            System.out.print("Seleccione una opcion:  ");
            opcionMenu = sc.nextInt();
            
            // Segun la opcion se hace una accion diferente
            switch (opcionMenu) {
                
                // Pide los dos numeros y los guarda en la calculadora
                case 1:
                    
                    System.out.println("Ingrese el primer numero: ");
                    double numero1 = sc.nextDouble();          
                    
                    System.out.println("Ingrese el segundo numero: ");
                    double numero2 = sc.nextDouble();
                    
                    calculadora.ingresarNumeros(numero1, numero2);
                    
                    break;  
                    
                // Muestra el resultado de la suma
                case 2:
                    
                    System.out.println("Resultado de la suma: " + calculadora.calcularSuma());
                    
                    break;     
                    
                // Muestra el resultado de la resta
                case 3:
                    
                    System.out.println("Resultado resta: " + calculadora.calcularResta());
                    
                    break;     
                    
                // Muestra el resultado de la multiplicacion
                case 4:
                    
                    System.out.println("Resultado multiplicacion: " + calculadora.calcularMultiplicacion());
                    
                    break;       
                    
                // Muestra el resultado de la division
                case 5:
                    
                    System.out.println("Resultado division: " + calculadora.calcularDivision());
                    
                    break;
                    
                // Despide al usuario y el ciclo termina
                case 0:
                    
                    System.out.println("GRACIAS POR USAR LA CALCULADORA");
                    
                    break;
                    
                // Si escribe un numero que no esta en el menu
                default:
                    System.out.println("Opcion invalida, intente de nuevo.");
            }
            
        } while (opcionMenu != 0);
        
        // Se cierra el scanner al terminar
        sc.close();
        
    }
    
}
