package com.lptec.lablivro.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Autor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nomeAutor;

	public Autor() {
	}
	
	@OneToMany(mappedBy = "autor")
	private Set<Livro> livros = new HashSet<>();

	public Autor(Long id, String nomeAutor) {
		super();
		this.id = id;
		this.nomeAutor = nomeAutor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nomeAutor;
	}

	public void setNome(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public Set<Livro> getLivros() {
		return getLivros();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(id, other.id);
	}



}
