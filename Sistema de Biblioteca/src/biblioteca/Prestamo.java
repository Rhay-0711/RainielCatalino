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
public class Prestamo {
    
    // Datos del prestamo: fecha, usuario y libro
    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;

    // Constructor que recibe los tres datos
    public Prestamo(LocalDate fecha, Usuario usuario, Libro libro) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.libro = libro;
    }

    // Devuelve la fecha del prestamo
    public LocalDate getFecha() {
        return fecha;
    }

    // Devuelve el usuario que hizo el prestamo
    public Usuario getUsuario() {
        return usuario;
    }

    // Devuelve el libro prestado
    public Libro getLibro() {
        return libro;
    }
}
