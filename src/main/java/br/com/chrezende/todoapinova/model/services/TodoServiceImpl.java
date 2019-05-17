package br.com.chrezende.todoapinova.model.services;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.chrezende.todoapinova.model.Todo;
import br.com.chrezende.todoapinova.model.repositories.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository repo;

	@PostConstruct
	private void loadTodos() {
		postTodo(new Todo("Comprar um pendrive", false));
	}

	@Override
	public List<Todo> getAllTodos() {
		return repo.findAll();
	}

	@Override
	public String postTodo(Todo todo) {
		return repo.save(todo).getId();
	}

	@Override
	public void putTodo(Todo todo, String id) {
		Todo dbObj = repo.findById(id).get();
		if (dbObj != null) {
			todo.setId(id);
			repo.save(todo);
		}

	}

}
