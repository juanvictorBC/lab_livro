package com.lptec.lablivro.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo;
	private String editora;
	private int anoPublicacao;

	@ManyToOne
	@JoinColumn(name="autor_id")
	private Autor autor;

	@ManyToMany
	@JoinTable(name="livro_categoria", joinColumns = @JoinColumn(name="livro_id"),
	inverseJoinColumns = @JoinColumn(name="categoria_id")
	)
	private Set<Categoria> categorias = new HashSet<>();

	public Livro() {
	}

	public Livro(Long id, String titulo, String editora, int anoPublicacao, Autor autor, Set<Categoria> categorias) {
		this.id = id;
		this.titulo = titulo;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		this.autor = autor;
		this.categorias = categorias;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Set<Categoria> getCategoria() {
		return categorias;
	}

	public void setCategoria(Set<Categoria> categorias) {
		this.categorias = categorias;
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
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}

	

}