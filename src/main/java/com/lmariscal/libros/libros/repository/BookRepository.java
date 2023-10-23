package com.lmariscal.libros.libros.repository;

import com.lmariscal.libros.libros.Entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
    public interface BookRepository extends JpaRepository<Libro, String>{
        public List<Libro> findByDescription(String description);
        public List<Libro> findByNameAndDescription(String name,String description);

    }

