package com.biblioteca.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.apirest.entities.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{

}
