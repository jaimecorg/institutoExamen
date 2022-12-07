package com.jaimecorg.instituto.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jaimecorg.instituto.dao.AlumnosDAO;
import com.jaimecorg.instituto.model.Alumno;
import com.jaimecorg.instituto.services.AlumnosServices;


@Service
public class AlumnosServicesImpl implements AlumnosServices {

    @Autowired
    AlumnosDAO alumnosDAO;

    @Override
    public Page<Alumno> findAll(Pageable page) {
        return alumnosDAO.findAll(page);
    }

    @Override
    public Alumno findById(int codigo) {

        return alumnosDAO.findById(codigo);
    }

    @Override
    public void insert(Alumno alumno) {
        alumnosDAO.insert(alumno);
    }

    @Override
    public void update(Alumno alumno) {
        alumnosDAO.update(alumno);
    }

    @Override
    public void delete(int codigo) {
        alumnosDAO.delete(codigo);
    }

}
