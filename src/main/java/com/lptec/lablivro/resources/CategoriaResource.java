package com.lptec.lablivro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lptec.lablivro.domain.Categoria;
import com.lptec.lablivro.repositories.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping
	public List<Categoria> listarTodas() {
		return categoriaRepository.findAll();
	}

	@PostMapping
	public Categoria adicionar(@RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
}
