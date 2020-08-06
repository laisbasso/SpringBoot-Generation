package br.com.minhaRedeSocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.minhaRedeSocial.model.TemaModel;

@Repository
public interface TemaRepository extends JpaRepository<TemaModel, Long> {

}
