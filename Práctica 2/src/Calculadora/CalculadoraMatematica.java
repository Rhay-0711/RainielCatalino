/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author User
 */

public class CalculadoraMatematica {
    
    // Primer numero para las operaciones
    private double numero1;    
    // Segundo numero para las operaciones
    private double numero2;

    // Constructor
    public CalculadoraMatematica() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    // Devuelve el primer numero
    public double getNumero1() {
        return numero1;
    }

    // Devuelve el segundo numero
    public double getNumero2() {
        return numero2;
    }
    
    // Guarda los dos numeros que manda el usuario
    public void ingresarNumeros(double numero1, double numero2){
        
        this.numero1 =  numero1;
        this.numero2 = numero2;
        
    }
    
    // Suma los dos numeros
    public double calcularSuma(){
        
        return numero1 + numero2;
        
    }
        
    // Resta los dos numeros
    public double calcularResta(){
        
        return numero1 - numero2;
        
    }
        
    // Multiplica los dos numeros
    public double calcularMultiplicacion(){
        
        return numero1 * numero2;
        
    }
        
    // Divide el primer numero entre el segundo
    public double calcularDivision(){
        
        // Si el segundo numero es cero avisa y devuelve 0
        if (numero2 == 0) {
            
            System.out.println("No se pude dividir entre 0");
            return 0;
        }
        
        return numero1 /  numero2;
        
    }
    
    
    
}