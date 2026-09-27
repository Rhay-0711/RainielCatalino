/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Realizar un programa que mediante la utilización de bucles, debe permitir imprimir cualquier tabla de multiplicar.

package tablamultiplicar;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el numero de la tabla de multiplicacion: ");
        
        int num = sc.nextInt();
        
        for (int i = 15; i <=10; i++) {
            
            System.out.println( num +  " X " + i + " = " +  (num * i));
            
        }
        
    }
    
}
