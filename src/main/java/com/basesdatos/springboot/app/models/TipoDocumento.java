package com.basesdatos.springboot.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TIPOSDOC", schema = "SYSTEM")
public class TipoDocumento {
    @Id
    @Column(name = "IDTIPODOC")
    private String idTipoDoc;
    @Column(name = "DESCTIPODOC") 
    private String descTipoDoc;
    
	public String getIdTipoDoc() {
		return idTipoDoc;
	}
	public void setIdTipoDoc(String idTipoDoc) {
		this.idTipoDoc = idTipoDoc;
	}
	public String getDescTipoDoc() {
		return descTipoDoc;
	}
	public void setDescTipoDoc(String descTipoDoc) {
		this.descTipoDoc = descTipoDoc;
	}
}
