package com.lptec.lablivro.resources;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lptec.lablivro.domain.Autor;
import com.lptec.lablivro.domain.Livro;
import com.lptec.lablivro.repositories.AutorRepository;
import com.lptec.lablivro.resources.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/autores")
public class AutorResource {
	
	@Autowired
	private AutorRepository autorRepository;

	@GetMapping
	public List<Autor> listarTodos(){
		return autorRepository.findAll();
	}
	
	@PostMapping
	public Autor adicionar(@RequestBody Autor autor) {
		return autorRepository.save(autor);
	}
	
	@GetMapping("/{id}/livros")
	public Set<Livro> listarLivrosPorAutor(@PathVariable Long id) {
	    Autor autor = autorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Autor não encontrado!"));
	    return autor.getLivros();
	}
}
