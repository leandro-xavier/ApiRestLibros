package com.lmariscal.libros.libros.Controller;

import com.lmariscal.libros.libros.Entidades.Libro;
import com.lmariscal.libros.libros.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")

public class LibrosController {
    @Autowired
    private BookService librosService;
   @RequestMapping(value= "/saveBook", method = RequestMethod.POST)
    public Boolean saveLibro(@RequestBody Libro u){
      return librosService.saveLibro(u);
    }


    @GetMapping("/allBook")
    public List<Libro> allBooks() {
        return librosService.findAllBooks();
    }


}
