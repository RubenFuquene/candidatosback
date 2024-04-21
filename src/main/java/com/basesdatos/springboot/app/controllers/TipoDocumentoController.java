package com.basesdatos.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.basesdatos.springboot.app.models.TipoDocumento;
import com.basesdatos.springboot.app.repositories.TipoDocumentoRepository;

import java.util.List;

@RestController
@RequestMapping("/tipos-documento")
public class TipoDocumentoController {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    // Endpoint para obtener todos los tipos de documento
    @GetMapping
    public List<TipoDocumento> getAllTiposDocumento() {
        return tipoDocumentoRepository.findAllTiposDocumento();
    }
}
