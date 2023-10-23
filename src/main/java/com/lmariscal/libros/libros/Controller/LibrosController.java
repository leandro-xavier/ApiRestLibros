package com.lmariscal.libros.libros.Controller;

import com.lmariscal.libros.libros.Entidades.Libro;
import com.lmariscal.libros.libros.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")

public class LibrosController {
    @Autowired
    private BookService librosService;
    @RequestMapping(value= "/saveBook", method = RequestMethod.POST)
    public Boolean saveLibro(@RequestBody Libro u){
        return librosService.saveLibro(u);
    }
}
