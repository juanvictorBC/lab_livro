package com.lptec.lablivro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lptec.lablivro.domain.Livro;
import com.lptec.lablivro.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;
	
	public Livro salvarLivro(Livro livro) {
		return livroRepository.save(livro);
	}
	
	public List<Livro> obterTodosLivros() {
		return livroRepository.findAll();
	}
	
	public Livro obterLivroPorId(Long id) {
		return livroRepository.findById(id).orElse(null);
	}
	
	public void excluirLivro(Long id) {
		livroRepository.deleteById(id);
	}
}