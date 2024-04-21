package com.basesdatos.springboot.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "CANDIDATOS", schema = "SYSTEM")
public class Candidato {
    @Id
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "FECHANAC")
    private Date fechaNac;
    @Column(name = "NDOC")
    private Long nDoc;
    @Column(name = "TIPODOC")
    private String tipoDoc;
    
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String column1) {
		this.nombre = column1;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public Long getnDoc() {
		return nDoc;
	}
	public void setnDoc(Long nDoc) {
		this.nDoc = nDoc;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

    
}
