package com.minhaescola.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.minhaescola.escola.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	
	
}
