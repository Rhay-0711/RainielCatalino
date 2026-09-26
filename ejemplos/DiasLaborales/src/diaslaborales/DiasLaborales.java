/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diaslaborales;

/**
 *
 * @author User
 */
public class DiasLaborales {

    public static void main(String[] args) {
        
        String dia = "Lunes";
        String tipoJonada;
        int horasTrabajo;
        
        switch (dia) {
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                tipoJonada = "Dia Laboral";
                horasTrabajo = 8;
                break;
                
            case "Sabado":
                tipoJonada = "Medio dia";
                horasTrabajo = 4;
                break;
                
            case "Domingo":
                tipoJonada = "Descanso";
                horasTrabajo = 0;
                break;
                
            default:
                tipoJonada = "Dia no valido";
                horasTrabajo = 0;
        }
        
        System.out.println("Dia: " + dia);
        System.out.println("Tipo: " + tipoJonada);
        System.out.println("Horas de trabajo: " + horasTrabajo);
        
    }
    
}
