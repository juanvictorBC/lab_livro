package com.lptec.lablivro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lptec.lablivro.domain.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
	

}