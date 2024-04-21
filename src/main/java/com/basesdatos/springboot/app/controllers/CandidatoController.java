package com.basesdatos.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.basesdatos.springboot.app.controllers.requests.CandidatoRequest;
import com.basesdatos.springboot.app.models.Candidato;
import com.basesdatos.springboot.app.repositories.CandidatoRepository;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    @Autowired
    private CandidatoRepository candidatoRepository;

    // Endpoint para obtener todos los candidatos
    @GetMapping
    public List<Candidato> getAllCandidatos() {
        return candidatoRepository.findAllCandidatos();
    }

    // Endpoint para agregar un nuevo candidato
    @PostMapping
    public Candidato addCandidato(@RequestBody CandidatoRequest request) {
    	Candidato candidato = new Candidato();
        candidato.setUsuario(request.getUsuario());
        candidato.setNombre(request.getNombre());
        candidato.setApellido(request.getApellido());
        candidato.setFechaNac(request.getFechaNac());
        candidato.setnDoc(request.getnDoc());
        candidato.setTipoDoc(request.getTipoDoc());
        
        return candidatoRepository.save(candidato);
    }
}
