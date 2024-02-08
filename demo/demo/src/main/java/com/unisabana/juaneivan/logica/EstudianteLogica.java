package com.unisabana.juaneivan.logica;

import com.unisabana.juaneivan.Entity.Estudiante;
import com.unisabana.juaneivan.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteLogica {

    @Autowired
    private Repository repository;

    public Estudiante addEstudiante(Estudiante estudiante){
        return repository.save(estudiante);
    }

    public List<Estudiante> getEstudiante(){
        return repository.findAll();
    }
}
