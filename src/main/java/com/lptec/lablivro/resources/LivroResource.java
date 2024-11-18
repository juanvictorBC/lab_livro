package com.lptec.lablivro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lptec.lablivro.domain.Livro;
import com.lptec.lablivro.services.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroResource {

	@Autowired
	private LivroService livroService;

	@PostMapping
	public Livro salvarLivro(@RequestBody Livro livro) {
		return livroService.salvarLivro(livro);
	}

	@GetMapping
	public List<Livro> obterTodosLivros() {
		return livroService.obterTodosLivros();
	}

	@GetMapping("/{id}")
	public Livro obterLivroPorId(@PathVariable Long id) {
		return livroService.obterLivroPorId(id);
	}

	@DeleteMapping("/{id}")
	public void excluirLivro(@PathVariable Long id) {
		livroService.excluirLivro(id);
	}
}