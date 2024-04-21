package com.basesdatos.springboot.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.basesdatos.springboot.app.models.Candidato;

import java.util.Date;
import java.util.List;

public interface CandidatoRepository extends JpaRepository<Candidato, String> {

    // Método para traer todos los candidatos
    @Query(value = "SELECT * FROM CANDIDATOS", nativeQuery = true)
    List<Candidato> findAllCandidatos();

    // Método para insertar un candidato
    @Transactional
    @Query(value = "INSERT INTO CANDIDATOS (usuario, nombre, apellido, fechaNac, nDoc, tipoDoc) VALUES (?1, ?2, ?3, ?4, ?5, ?6)", nativeQuery = true)
    Candidato insertCandidato(String usuario, String nombre, String apellido, Date fechaNac, Long nDoc, String tipoDoc);
}
