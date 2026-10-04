/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tv;

/**
 *
 * @author User
 */
public class Tv {
    
        public String marca;
        public int pulgadas;
        public boolean  encendido;
        public int volumen;
        
        public void encender() {
            
            System.out.println("La TV se esta encendiendo...");
            
        }        
        
        public void apagar() {

            System.out.println("La TV se esta apagando...");
            
        }
        
        public void subirVolumen(){
            
            System.out.println("Subiendo el volumen...");
            
        }        
        
        public void bajarVolumen(){
            
            System.out.println("Bajando el volumen...");
            
        }
    
}
