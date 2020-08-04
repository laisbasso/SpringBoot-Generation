package br.com.minhaescola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.minhaescola.model.TurmaModel;

@Repository
public interface TurmaRepository extends JpaRepository<TurmaModel, Long> {

}
