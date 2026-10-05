/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author User
 */
public class Prueba {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // Pruebas con 2 parámetros
        System.out.println("Suma 8 + 6: " + calc.sumar(8, 6));
        System.out.println("Resta 15 - 7: " + calc.restar(15, 7));
        System.out.println("Multiplicacion 4 * 9: " + calc.multiplicar(4, 9));
        System.out.println("Division 36 / 6: " + calc.dividir(36, 6));

        // Pruebas con 3 parámetros
        System.out.println("Suma 7 + 4 + 6: " + calc.sumar(7, 4, 6));
        System.out.println("Resta 18 - 5 - 3: " + calc.restar(18, 5, 3));
        System.out.println("Multiplicacion 3 * 5 * 2: " + calc.multiplicar(3, 5, 2));

        // Pruebas con 4 parámetros
        System.out.println("Suma 2 + 4 + 6 + 8: " + calc.sumar(2, 4, 6, 8));
        System.out.println("Resta 30 - 8 - 5 - 3: " + calc.restar(30, 8, 5, 3));
        System.out.println("Multiplicacion 2 * 3 * 4 * 5: " + calc.multiplicar(2, 3, 4, 5));

    }
}