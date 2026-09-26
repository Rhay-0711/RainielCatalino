/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemalogin;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String passwordCorrecto = "1234";
        int intentosMaximos = 3;
        int intentos = 0;
        boolean accesoConcedido = false;

        while (intentos < intentosMaximos && !accesoConcedido) {
            System.out.println("\n=== SISTEMA DE LOGIN ===");
            System.out.println("Intento " + (intentos + 1) + " de " + intentosMaximos);

            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Contraseña: ");
            String password = scanner.nextLine();

            if (usuario.equals(usuarioCorrecto) &&
                password.equals(passwordCorrecto)) {
                accesoConcedido = true;
                System.out.println("\n Acceso concedido. ¡Bienvenido!");
            } else {
                intentos++;
                if (intentos < intentosMaximos) {
                    System.out.println(" Credenciales incorrectas. " +
                            "Intente nuevamente.");
                }
            }
        }

        if (!accesoConcedido) {
            System.out.println("\n✗ Cuenta bloqueada por exceso de intentos.");
        }

        scanner.close();
    }
}