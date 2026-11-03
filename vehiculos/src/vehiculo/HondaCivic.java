/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author User
 */
public class HondaCivic extends AutoMovil{

    public HondaCivic() {
        
        super();
        System.out.println("Constructor de HondaCivic");
        
    }
    
    @Override
    public void encender(){
        System.out.println("---El carro HondaCivic esta encendiendo---");
    }
    
    @Override
    public void apagar(){
        System.out.println("---El carro HondaCivic se esta apagando---");
    }
    
}
