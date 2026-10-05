/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class MAIN {
    
    public static void main(String[] args) {
        
        // Se crean los libros
        Libro libro1 = new Libro( "Don Quijote de la Mancha",
                "Miguel de Cervantes",
                "123456");
         
        Libro libro2 = new Libro( "La mañosa",
                "JuanBosh",
                "789010");
        
        // Se crean los usuarios
        Usuario user1 = new Usuario("Pepe", 2);
        Usuario user2 = new Usuario("Petete", 3);
        
        // Se consulta la disponibilidad inicial de los libros
        System.out.println("---Consultar libros---");
        System.out.println(libro1.consultarDisponibilidad());
        System.out.println(libro2.consultarDisponibilidad());
        System.out.println("------------------------------------");
        // El usuario 1 toma prestado el libro 2
        System.out.println("Tomar un libro");
        user1.prestarLibro(libro2);
        System.out.println("El usuario 1 tomo un libro prestado");
        System.out.println("------------------------------------");
        
        // Se consulta otra vez, el libro 2 ya deberia estar prestado
        System.out.println("---Consultar libros---");
        System.out.println(libro1.consultarDisponibilidad());
        System.out.println(libro2.consultarDisponibilidad());
        System.out.println("-----------------------------------------");
        
        // Se registra el prestamo del usuario 1
        Prestamo pres1 = new Prestamo(LocalDate.now(), user1, libro2);
        
        // Se muestran los datos del prestamo 1
        System.out.println("Fecha:  " + pres1.getFecha());
        System.out.println("Usuario: " + pres1.getUsuario().getNombre());
        System.out.println("Libro: " + pres1.getLibro().getTitulo());
        System.out.println("-------------------------------------------------------------");
        // El usuario 2 toma prestado el libro 1
        System.out.println("Tomar un libro");
        user2.prestarLibro(libro1);
        System.out.println("El usuario 2 tomo un libro prestado");
        System.out.println("------------------------------------");
        
        // Se registra el prestamo del usuario 2
        Prestamo pres2 = new Prestamo(LocalDate.now(), user2, libro1);
        // Se muestran los datos del prestamo 2
        System.out.println("Fecha:  " + pres2.getFecha());
        System.out.println("Usuario: " + pres2.getUsuario().getNombre());
        System.out.println("Libro: " + pres2.getLibro().getTitulo());
        System.out.println("--------------------------------------------------------------");
        
        // El usuario 1 devuelve el libro 2
        user1.devolverLibro(libro2);
        
        System.out.println("Se devolvio el libro 2");
        System.out.println("---------------------------");
        // Se consulta la disponibilidad del libro 2 despues de devolverlo
        System.out.println("consultar");
        libro2.consultarDisponibilidad();
    }
    
}
