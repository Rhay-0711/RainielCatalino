/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaVehiculos;

/**
 *
 * @author User
 */
public class MAIN {
    
    public static void main(String[] args) {
        
        // Se crean tres vehiculos con distintos datos
        Vehiculo carro1 = new Vehiculo("AB123456");        
        Vehiculo carro2 = new Vehiculo("BB789012", "Honda");        
        Vehiculo carro3 = new Vehiculo("CB3456786", "Toyota", "Runner");
        
        // Informacion del vehiculo 1 (solo placa)
        System.out.println("------Informacion del vehiculo---------");
        System.out.println("Placa: " + carro1.getPlaca());
        System.out.println("Mantenimiento: " + carro1.calcularMantenimiento(1000));        
        // Informacion del vehiculo 2 (placa y marca)
        System.out.println("------Informacion del vehiculo---------");
        System.out.println("Placa: " + carro2.getPlaca());
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Mantenimiento: " + carro2.calcularMantenimiento(1000, "Basico"));        
        // Informacion del vehiculo 3 (placa, marca y modelo)
        System.out.println("------Informacion del vehiculo---------");
        System.out.println("Placa: " + carro3.getPlaca());
        System.out.println("Marca: " + carro3.getMarca());
        System.out.println("Modelo: " + carro3.getModelo());
        System.out.println("Mantenimiento: " + carro3.calcularMantenimiento(1000, "Completo", 10));
    }
    
}
