package com.jaimecorg.instituto.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jaimecorg.instituto.model.Alumno;

public interface AlumnosDAO {
    
    public Page<Alumno> findAll(Pageable page);
    public Alumno findById(int codigo);
    public void insert(Alumno alumno);
    public void update(Alumno alumno);
    public void delete(int codigo);

}
