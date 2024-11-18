package com.lptec.lablivro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lptec.lablivro.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}