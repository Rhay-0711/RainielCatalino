/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menurestaurante;

/**
 *
 * @author User
 */
public class MenuRestaurante {

    public static void main(String[] args) {
        
        int opcion = 3;
        String plato;
        double precio;
        
        switch (opcion) {
            case 1:
              plato = "Hamburguesa Clasica";
              precio = 8.99;
             break;
             
             case 2:
              plato = "Pizza Margherita";
              precio = 12.50;
             break;
             
             case 3:
              plato = "Ensalada cesar";
              precio = 7.99;
             break;
             
             case 4:
              plato = "Pasta Carbonara";
              precio = 11.00;
             break;
             
             case 5:
              plato = "Sushi";
              precio = 15.99;
             break;
             
            default:
                throw new AssertionError();
        }
        
        System.out.println("==Pedido==");
        System.out.println("Plato seleccionado: " + plato);
        System.out.println("Precio: $" + precio);
        
    }
    
}
