/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Realizar un programa que ingresado un numero, me indique si es par o impar.

package paroimpar;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class ParOImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        
        
    }
    
}
