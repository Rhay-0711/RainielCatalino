/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package incrementopeersonalizados;

/**
 *
 * @author User
 */
public class IncrementoPEersonalizados {

    public static void main(String[] args) {

        System.out.println("Numeros pares del 0 al 20:");
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Contar hacia atrás
        System.out.println("Cuenta regresiva:");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
            if (i == 0) {
                System.out.println("¡DESPEGUE!");
            }
        }
        
    }
    
}