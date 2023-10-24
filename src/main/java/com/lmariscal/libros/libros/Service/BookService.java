package com.lmariscal.libros.libros.Service;

import com.lmariscal.libros.libros.Entidades.Libro;

import java.util.List;

public interface BookService {

        public Boolean saveLibro(Libro libro);

        List<Libro> findAllBooks();

}
