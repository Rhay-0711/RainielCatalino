/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadescuentos;

/**
 *
 * @author User
 */
public class SistemaDescuentos {

    public static void main(String[] args) {
        
        double totalCompra = 1500.00;
        String tipoCliente = "VIP";
        double descuento = 0;
        
        if (totalCompra >= 2000) {
            descuento = 0.20;
        }else if (totalCompra >= 1000) {
            descuento = 0.15;
        }else if (totalCompra >= 500) {
            descuento = 0.10;
        }
        
        if (tipoCliente.equals("VIP")) {
           descuento += 0.05;
        }else if (tipoCliente.equals("Premium")) {
            descuento += 0.03;
        }
        
        double montoDescuento = totalCompra * descuento;
        double totalFinal = totalCompra - montoDescuento;
        
        System.out.println("===Destalles de compra===");
        System.out.println("Subtotal: $" + totalCompra);
        System.out.println("Tipo de cliente: " + tipoCliente);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Monto descontado: $" + montoDescuento);
        System.out.println("TOTAL A PAGAR: $" + totalFinal);
    }
    
}
