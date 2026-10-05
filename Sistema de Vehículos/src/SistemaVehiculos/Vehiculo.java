/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaVehiculos;

/**
 *
 * @author User
 */
public class Vehiculo {
    
    // Datos del vehiculo: placa, marca y modelo
    private String placa;
    private String marca;
    private String modelo;

    // Constructor solo con placa
    public Vehiculo(String placa) {
        this.placa = placa;
    }

    // Constructor con placa y marca
    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    // Constructor con placa, marca y modelo
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Devuelve la placa
    public String getPlaca() {
        return placa;
    }

    // Devuelve la marca
    public String getMarca() {
        return marca;
    }

    // Devuelve el modelo
    public String getModelo() {
        return modelo;
    }
    
    // Mantenimiento basico: 0.05 por cada km
    public double calcularMantenimiento(int km){
    
        return km * 0.05;
        
    }    
    
    // Mantenimiento segun el tipo de servicio
    public double calcularMantenimiento(int km, String tipoServicio){
    
        double precio = km * 0.05;
        // Se suma un extra segun el servicio
        if (tipoServicio.equalsIgnoreCase("basico")) {
            precio += 100;
        } else if (tipoServicio.equalsIgnoreCase("completo")) {
            precio += 1000;
        }
        
        return precio;
        
    }
    
        // Mantenimiento con descuento en porcentaje
        public double calcularMantenimiento(int km, String tipoServicio, double descuento){
    
        // Se calcula el precio y luego se le resta el descuento
        double precio = calcularMantenimiento(km, tipoServicio);
        return precio - (precio * descuento / 100);
        
    }
}
