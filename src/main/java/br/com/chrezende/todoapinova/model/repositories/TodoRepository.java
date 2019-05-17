package br.com.chrezende.todoapinova.model.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.chrezende.todoapinova.model.Todo;

public interface TodoRepository extends  MongoRepository<Todo, String> {

}
