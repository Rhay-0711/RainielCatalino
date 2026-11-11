/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author User
 */
public class ConversorTemperatura {

    //convierte de celcius a fahrenheit 
    public double fahrenheit(double a) {

        return (a * 9 / 5) + 32;

    }

    //convierte de fahrenheit a celcius 
    public double celius(double a) {

        return (a - 32) * 5/9;

    }

}
