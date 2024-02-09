package com.unisabana.juaneivan.controller;
import java.util.List;
import com.unisabana.juaneivan.Entity.Estudiante;
import com.unisabana.juaneivan.logica.EstudianteLogica;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class EstudianteController {

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
