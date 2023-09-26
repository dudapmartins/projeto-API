package com.senai.MariaEduardaMartins.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;

	@Column(name = "nCliente")
	private String nCliente;

	@Column(name = "Fone")
	private String Fone;

	public Long getId() {
		return idcCliente;
	}

	public void setidcCliente(Long idcCliente) {
		this.idcCliente = idcCliente;
	}

	public String getnCliente() {
		return nCliente;
	}

	public void setnCliente(String nCliente) {
		this.nCliente = nCliente;
	}

	public String getFone() {
		return Fone;

	}

	public void setFone(String Fone) {
		this.Fone = Fone;
	}
}
