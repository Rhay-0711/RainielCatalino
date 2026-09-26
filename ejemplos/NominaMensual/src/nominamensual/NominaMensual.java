/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nominamensual;

/**
 *
 * @author User
 */
public class NominaMensual {

    public static void main(String[] args) {
        
        double salarioPorHora = 15.50;
        int[] horasTrabajadas = {8, 8, 7, 9, 8, 6, 0};
        String[] dias = {"Lun", "Mar", "Mie", "Jue", "Vie", "Sab", "Dom"};
        
        double totalSemanal = 0;
        
        System.out.println("Preporte semanal");
        System.out.println("Salario por horo: $" + salarioPorHora);
        System.out.println("\nDetalle diario");
        
        for (int i = 0; i < horasTrabajadas.length; i++) {
            
            double pagoDiario = horasTrabajadas[i] * salarioPorHora;
            totalSemanal += pagoDiario;
            
            System.out.println(dias[i] + ": " + horasTrabajadas[i] + "  horas = $" + pagoDiario);
            
        }
        
        System.out.println("\nTotal semanal: $" + totalSemanal);
        System.out.println("Total mensual:  $" + (totalSemanal *  4));
        
    }
    
}
