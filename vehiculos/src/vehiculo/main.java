/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author User
 */
public class main {
    
    public static void main(String[] args) {
        
        AutoMovil auto = new AutoMovil();
        auto.setMarca("Ford");
        auto.setModelo("Runner");
        auto.setAño(2025);
        auto.setColor("Rojo");
        
        System.out.println("Marca: " + auto.getMarca());
        auto.encender();
        auto.apagar();
        
        System.out.println("--Honda Civic--");
        
        HondaCivic honda = new HondaCivic();
        honda.setMarca("Honda");
        honda.setModelo("Civic");
        honda.setAño(2026);
        honda.setColor("Azul");
        
        System.out.println("Marca: " + honda.getMarca());
        honda.encender();
        honda.apagar();
        
    }
    
}
