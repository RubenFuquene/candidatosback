package com.basesdatos.springboot.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.basesdatos.springboot.app.models.TipoDocumento;

import java.util.List;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, String> {

    // Método para devolver todos los tipos de documento
    @Query(value = "SELECT * FROM TIPOSDOC", nativeQuery = true)
    List<TipoDocumento> findAllTiposDocumento();
}
