package com.lptec.lablivro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lptec.lablivro.domain.Autor;
import com.lptec.lablivro.repositories.AutorRepository;

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
}
