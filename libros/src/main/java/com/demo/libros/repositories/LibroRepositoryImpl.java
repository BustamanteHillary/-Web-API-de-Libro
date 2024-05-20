package com.demo.libros.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.demo.libros.models.Libro;

@Repository
public class LibroRepositoryImpl implements LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryImpl() {
        libros.add(new Libro(1, "El nombre de la rosa", "Umberto Eco", "Editorial Planeta", 1980));
        libros.add(new Libro(2, "La sombra del viento", "Carlos Ruiz Zafón", "Editorial Planeta", 2001));
        libros.add(
                new Libro(3, "Crónica de una muerte anunciada", "Gabriel García Márquez", "Editorial Bruguera", 1981));
    }

    public Libro getLibro(int id) {
        System.out.println("Conexión de la BD");
        for (Libro libro : libros) {
            if (id == libro.getId())
                return libro;

        }

        return null;
    }

    public List<Libro> getLibros() {
        System.out.println("Conexión de la BD");
        return libros;
    }

    @Override
    public Libro nuevLibro(Libro libro) {
        libros.add(libro);
        return libro;
    }

}
