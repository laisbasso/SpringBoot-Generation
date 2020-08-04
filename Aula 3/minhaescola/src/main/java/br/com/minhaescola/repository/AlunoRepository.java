package br.com.minhaescola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.minhaescola.model.AlunoModel;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {

}
