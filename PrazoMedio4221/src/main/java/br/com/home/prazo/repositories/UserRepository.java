package br.com.home.prazo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.home.prazo.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}