/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Realizar un programa que dado dos números, me indique cual es el mayor y cual es el menor de ambos.

package numeromayoromenor;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class NumeroMayorOMenor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();     
        
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        
        
        if (num1 > num2) {
            System.out.println("El primer numero es mayor");
        }else if (num2 > num1) {
            System.out.println("El segundo numero es mayor");
        }else if (num1 == num2) {
            System.out.println("Ambos numeros son iguales");
        }
        
        
    }
    
}
