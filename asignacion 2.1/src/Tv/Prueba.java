/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tv;

/**
 *
 * @author User
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        Tv tv3 = new Tv();
        
        
        //tv1
        tv1.marca = "LG";
        tv1.pulgadas = 32;
        tv1.volumen = 10;
        
        System.out.println("==== TV 1 ====");
        System.out.println("Marca: " + tv1.marca);
        System.out.println("Pulgadas: " + tv1.pulgadas);
        System.out.println("Volumen: " + tv1.volumen);
        
        tv1.encender();
        tv1.apagar();
        tv1.bajarVolumen();
        tv1.subirVolumen();
        
        System.out.println(" ");
                
        //tv2
        tv2.marca = "AMERICAN";
        tv2.pulgadas = 52;
        tv2.volumen = 60;
        
        System.out.println("==== TV 2 ====");
        System.out.println("Marca: " + tv2.marca);
        System.out.println("Pulgadas: " + tv2.pulgadas);
        System.out.println("Volumen: " + tv2.volumen);
        
        tv2.encender();
        tv2.apagar();
        tv2.bajarVolumen();
        tv2.subirVolumen();
        
          System.out.println(" ");
                
        //tv3
        tv3.marca = "Samsung";
        tv3.pulgadas = 58;
        tv3.volumen = 90;
        
        System.out.println("==== TV 3 ====");
        System.out.println("Marca: " + tv3.marca);
        System.out.println("Pulgadas: " + tv3.pulgadas);
        System.out.println("Volumen: " + tv3.volumen);
        
        tv3.encender();
        tv3.apagar();
        tv3.bajarVolumen();
        tv3.subirVolumen();
        
    }
    
}
