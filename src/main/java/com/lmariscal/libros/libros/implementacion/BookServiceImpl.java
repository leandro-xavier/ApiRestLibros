package com.lmariscal.libros.libros.implementacion;

import com.lmariscal.libros.libros.Entidades.Libro;
import com.lmariscal.libros.libros.Service.BookService;
import com.lmariscal.libros.libros.repository.BookRepository;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Libro> findAllBooks() {

        List<Libro> allbooks = bookRepository.findAll();
        return allbooks;

    }

   @Override
   public Boolean saveLibro(Libro libro) {
       try {
           bookRepository.save(libro);
           return true;
       } catch (Exception e) {
           return false;
       }
   }


}
