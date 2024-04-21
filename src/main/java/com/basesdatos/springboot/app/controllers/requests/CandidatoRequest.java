package com.basesdatos.springboot.app.controllers.requests;

import java.util.Date;

public class CandidatoRequest {
    private String usuario;
    private String nombre;
    private String apellido;
    private Date fechaNac;
    private Long nDoc;
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
	public void setNombre(String nombre) {
		this.nombre = nombre;
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