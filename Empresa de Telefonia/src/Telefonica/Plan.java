/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telefonica;

/**
 *
 * @author User
 */
public class Plan {
    
    private int minutos;
    private double datos;
    private double precioMensual;

    public Plan(int minutos, double datos, double precioMensual) {
        this.minutos = minutos;
        this.datos = datos;
        this.precioMensual = precioMensual;
    }

    public int getMinutos() {
        return minutos;
    }

    public double getDatos() {
        return datos;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }
    
    
    
}
