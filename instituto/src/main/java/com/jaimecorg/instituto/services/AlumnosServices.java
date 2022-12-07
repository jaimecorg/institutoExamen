package com.jaimecorg.instituto.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jaimecorg.instituto.model.Alumno;


public interface AlumnosServices {
    

    public Page<Alumno> findAll(Pageable page);
    public Alumno findById(int codigo);
    public void insert(Alumno cliente);
    public void update(Alumno cliente);
    public void delete(int codigo);
}
