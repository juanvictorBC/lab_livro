package com.lptec.lablivro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lptec.lablivro.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}