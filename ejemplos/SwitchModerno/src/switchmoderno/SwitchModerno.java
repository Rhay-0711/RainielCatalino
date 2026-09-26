/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchmoderno;

/**
 *
 * @author User
 */
public class SwitchModerno {

    public static void main(String[] args) {
        
        String mes = "Enero";
        
        int  diasDelMes = switch (mes) {
            case  "Enero", "Marzo", "Mayo", "Julio", "Agosto", "Octubre", "Diciembre" -> 31;
            case "Abril", "Junio", "Septiembre", "Noviembre" -> 30;
            case "Febrero" -> 28;
            default -> 0;
    };
        
        System.out.println(diasDelMes);
        
        String trimestre = switch (mes){
            case  "Enero", "Febrero", "Marzo" -> {
                System.out.println("Primer trimestre del ano");
                yield "Q1";
            }
            case "Abril", "Junio", "Mayo" -> {
                System.out.println("Segudo trimestre del ano");
                yield "Q2";
            }
            case "Julio", "Agosto", "Septiembre" -> "Q3";
            case "Octubre", "Noviembre", "Diciembre" -> "Q4";
            default -> "Mes invalido";
        };
        
        System.out.println("trimestr: " + trimestre);
        
    }
}
