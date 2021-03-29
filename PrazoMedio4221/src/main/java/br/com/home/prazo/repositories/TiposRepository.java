package br.com.home.prazo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.home.prazo.entities.Tipo;

@Repository
public interface TiposRepository extends CrudRepository<Tipo, Long> {

}