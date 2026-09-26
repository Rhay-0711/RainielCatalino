/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author User
 */
public class OperadorTernario {

    public static void main(String[] args) {
       
        int edad = 17;
        String mensaje;
        
        if (edad >= 18) {
            mensaje = "Mayor de edad";
        } else {
            mensaje = "Menor de Edad";
        }
        
        String mensaje2 = (edad >= 18) ? "MAyor de edad" : "Menor de edad";
        
        System.out.println(mensaje2);
        
        int precio = 100;
        
        double precioFinal = (precio > 50) ? precio * 0.9 : precio;
        System.out.println("Precio final: $" + precioFinal);
        
        
    }
    
}
