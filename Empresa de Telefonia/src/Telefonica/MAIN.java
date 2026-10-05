/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telefonica;

/**
 *
 * @author User
 */
public class MAIN {
    
    public static void main(String[] args) {
        
        Plan plan = new Plan(500, 10, 1000);
        Cliente cliente = new Cliente("Pedro", "829-123-4567", plan);
        Factura factura = new Factura(cliente, 650, 12);
        
        factura.generarFactura();
        
    }
    
}
