package tarea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Libro implements Comparable<Libro> {
    private String titulo;
    private String autor;
    private int year;

    public Libro(String titulo, String autor, int year) {
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Libro other) {
        return this.titulo.compareTo(other.titulo);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + 
                ", autor='" + autor + 
                ", year=" + year; 
    }
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("La ciudad y los perros", "Mario Vargas Llosa", 1962));
        libros.add(new Libro("Lord of the Rings", "J.R.R. Tolkien", 1851));
        libros.add(new Libro("Mobi Dick", "Herman Melville", 1605));
        libros.add(new Libro("1984", "George Orwell", 1949));
        Collections.sort(libros);
        System.out.println("Libros ordenados por título:");
        libros.forEach(System.out::println);
    }
}
