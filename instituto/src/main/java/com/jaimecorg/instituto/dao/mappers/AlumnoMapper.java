package com.jaimecorg.instituto.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.lang.Nullable;

import com.jaimecorg.instituto.model.Alumno;

public class AlumnoMapper implements org.springframework.jdbc.core.RowMapper<Alumno> {

    @Override
    @Nullable
    public Alumno mapRow(ResultSet rs, int rowNum) throws SQLException {
        Alumno alumno = new Alumno();
        alumno.setCodigo(rs.getInt("codigo"));
        alumno.setNombre(rs.getString("nombre"));
        alumno.setApellidos(rs.getString("apellidos"));
        alumno.setFechaNacimiento(rs.getDate("fechaNacimiento"));
        alumno.setDni(rs.getString("dni"));
        alumno.setEmail(rs.getString("email"));
        alumno.setNuevo(rs.getBoolean("nuevo"));
        return alumno;
    }

}
