package com.unisabana.juaneivan.logica;

import com.unisabana.juaneivan.Entity.Estudiante;
import com.unisabana.juaneivan.Entity.Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class EstudianteLogica {

    private Repository repository;

    public Estudiante addEstudiante(Estudiante estudiante){
        return repository.save(estudiante);
    }

    public List<Estudiante> getEstudiante(){
        return repository.findAll();
    }
}
