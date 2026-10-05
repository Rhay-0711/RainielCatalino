/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Usuario {
    
    // Datos del usuario: nombre, ID y lista de libros que tiene prestados
    private String nombre;
    private int ID;
    private ArrayList<Libro> librosPrestados;

    // Constructor, la lista de libros empieza vacia
    public Usuario(String nombre, int ID) {
        this.nombre = nombre;
        this.ID = ID;
        this.librosPrestados = new ArrayList<>();
    }

    // Devuelve el nombre
    public String getNombre() {
        return nombre;
    }

    // Devuelve el ID
    public int getID() {
        return ID;
    }

    // Devuelve los libros que tiene prestados
    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }
    
    // Toma un libro prestado si esta disponible
    public void prestarLibro(Libro libro){
        
        if (libro.consultarDisponibilidad()) {
            
            // Marca el libro como prestado y lo guarda en la lista
            libro.prestarLibro();
            librosPrestados.add(libro);
            
            System.out.println("A tomado el libro:  " + libro.getTitulo());
            
        }else{
        
            // El libro ya estaba prestado
            System.out.println("No se a prestado");
            
        }
        
    }
    
    // Devuelve un libro si el usuario lo tiene prestado
    public void devolverLibro(Libro libro){
    
        if (librosPrestados.contains(libro)) {
            
            // Marca el libro como disponible y lo quita de la lista
            libro.devolverLibro();
            librosPrestados.remove(libro);
            
            System.out.println("Libro devuelto: " + libro.getTitulo());
            
        }else{
        
            // El usuario no tenia ese libro
            System.out.println("El libro no fue devuelto");
            
        }
        
    }
}
