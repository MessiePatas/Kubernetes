package com.unisabana.juaneivan.controller;
import java.util.List;
import com.unisabana.juaneivan.Entity.Estudiante;
import com.unisabana.juaneivan.logica.EstudianteLogica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController

public class EstudianteController {
    
    @Autowired
    private EstudianteLogica estudianteLogica;

@PostMapping("/agregar")
    public Estudiante addEstudiante(@RequestBody Estudiante estudiante){
        return estudianteLogica.addEstudiante(estudiante);
}

@GetMapping("/mostrar")
    public List<Estudiante> getEstudiante(){
        return estudianteLogica.getEstudiante();
}

}
