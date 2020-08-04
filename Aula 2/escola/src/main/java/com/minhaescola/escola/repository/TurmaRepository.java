package com.minhaescola.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.minhaescola.escola.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
	
}
