package br.com.chrezende.todoapinova.model.services;

import java.util.List;
import java.util.Map;

import br.com.chrezende.todoapinova.model.Todo;


public interface TodoService {
	List<Todo> getAllTodos();
	String postTodo(Todo todo);
	void putTodo(Todo todo,String id);
}
