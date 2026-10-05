/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telefonica;

/**
 *
 * @author User
 */
public class Cliente {
    
    // Datos del cliente: nombre, numero telefonico y su plan
    private String nombre;
    private String numeroTelefonico;
    private Plan planTelefonico;

    // Constructor que recibe los tres datos
    public Cliente(String nombre, String numeroTelefonico, Plan planTelefonico) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.planTelefonico = planTelefonico;
    }

    // Devuelve el nombre
    public String getNombre() {
        return nombre;
    }

    // Devuelve el numero telefonico
    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    // Devuelve el plan del cliente
    public Plan getPlanTelefonico() {
        return planTelefonico;
    }
    
}
