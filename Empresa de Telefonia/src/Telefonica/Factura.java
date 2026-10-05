/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telefonica;

/**
 *
 * @author User
 */
public class Factura {
    
    private Cliente cliente;
    private int minutosUsados; 
    private double datosGbUsados;
    
    private double precioMinutoExtra = 10.20;
    private double precioDatosGbExtra = 50;
    

    public Factura(Cliente cliente, int minutosUsados, double datosGbUsados) {
        this.cliente = cliente;
        this.minutosUsados = minutosUsados;
        this.datosGbUsados = datosGbUsados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getMinutosUsados() {
        return minutosUsados;
    }

    public double getDatosUsados() {
        return datosGbUsados;
    }

    public double calcularMinutosExtras(){
    
        int minutosExtras = minutosUsados - cliente.getPlanTelefonico().getMinutos();
        
        if (minutosExtras > 0) {
            return minutosExtras * precioMinutoExtra;
        }
        
        return 0;
        
    }
    
    public double calcularGbExtras(){
    
        double gbExtras = datosGbUsados - cliente.getPlanTelefonico().getDatos();
        
        if (gbExtras > 0) {
            return gbExtras * precioDatosGbExtra;
        }
        
        return 0;
        
    }
    
    public double montoTotal(){
        
        return cliente.getPlanTelefonico().getPrecioMensual() + calcularMinutosExtras()+calcularGbExtras();
        
    }
    
    public void generarFactura(){
        System.out.println("-------------------------------------------");
        System.out.println("               Factura");
        System.out.println("------------------------------------------");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Numero telefonico: " + cliente.getNumeroTelefonico());
        System.out.println("--------------------------------------------");
        System.out.println("            PLan");
        System.out.println("----------------------------------------------");
        System.out.println("Minutos: " + cliente.getPlanTelefonico().getMinutos());
        System.out.println("Datos (GB): " + cliente.getPlanTelefonico().getDatos());
        System.out.println("Precio mensual: RD$" + cliente.getPlanTelefonico().getPrecioMensual());
        System.out.println("-------------------------------------------------");
        System.out.println("          Detalles plan");
        System.out.println("---------------------------------------------------");
        System.out.println("Minutos usados: " + minutosUsados);
        System.out.println("Dstos usados: " + datosGbUsados);
        System.out.println("Cargos extras de datos (GB): " + calcularGbExtras());
        System.out.println("Cargos extras de minutos: " + calcularMinutosExtras());
        System.out.println("----------------------------------------------------");
        System.out.println("Total a pagar: RD$" + montoTotal());
        System.out.println("-------------------------------------------------------");
    }
    
    
}
