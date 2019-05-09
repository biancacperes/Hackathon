package com.stefanini.projeto.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;



@Entity
public class Condominio implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SQ_CM_NU", sequenceName = "SQ_CM_NU", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CM_NU")
	@Column(name = "CM_NU")
	private Long id;

	@Column(name = "CM_NO")
	private String nome;

	@OneToMany(mappedBy = "condominio")
	private List<Casa> casas;

	public Condominio() {
		super();
	}

	public Condominio(Long id, String nome) {
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

	
	public List<Casa> getCasas() {
		return casas;
	}

	public void setCasas(List<Casa> casas) {
		this.casas = casas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Condominio other = (Condominio) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}