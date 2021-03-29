package br.com.home.prazo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tipo {

	@Id
	private Long id;
	private String nome;

	public Tipo() {

	}

	public Tipo(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
