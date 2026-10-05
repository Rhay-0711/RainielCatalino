/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author User
 */
public class Libro {
    
    // Atributos del libro
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean disponible;

    // Constructor 
    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = true;
    }

    // Devuelve el titulo
    public String getTitulo() {
        return titulo;
    }

    // Devuelve el autor
    public String getAutor() {
        return autor;
    }

    // Devuelve el ISBN
    public String getISBN() {
        return ISBN;
    }

    // Indica si el libro esta disponible
    public boolean isDisponible() {
        return disponible;
    }
    
    // Consulta si el libro esta disponible
     public boolean consultarDisponibilidad (){
        
         return disponible;
         
    }
    
        // Presta el libro si esta disponible
        public void prestarLibro (){
        if (disponible) {
            disponible = false;
            System.out.println("Prestar libro");
            
        } else {
            // Si no esta disponible avisa
            System.out.println("El libro ya fue prestado");
        }
    }
        
        // Marca el libro como disponible otra vez
        public void devolverLibro(){
            
            disponible = true;
            System.out.println("El libro fue devuelto");
            
        }
    
}
