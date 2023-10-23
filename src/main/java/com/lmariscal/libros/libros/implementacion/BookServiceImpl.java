package com.lmariscal.libros.libros.implementacion;

import com.lmariscal.libros.libros.Entidades.Libro;
import com.lmariscal.libros.libros.Service.BookService;
import com.lmariscal.libros.libros.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

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
