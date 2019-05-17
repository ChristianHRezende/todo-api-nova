package br.com.chrezende.todoapinova.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.chrezende.todoapinova.model.Todo;
import br.com.chrezende.todoapinova.model.services.TodoServiceImpl;


@RestController
public class TodoResource {
	
	@Autowired
	private TodoServiceImpl service;
	
	@GetMapping(value = "/todos")
	public ResponseEntity<List<Todo>> getAllTodos(){
		
		return new ResponseEntity<>(service.getAllTodos(),HttpStatus.OK); 
	}
	
	@PostMapping(value= "/todo")
	public String postTodo(@RequestBody Todo todo) {
		return service.postTodo(todo);
	}
	
	@PutMapping(value = "/todos/{id}")
	public ResponseEntity<?> partialUpdateGeneric(
	  @RequestBody Todo todo,
	  @PathVariable("id") String id) {
	     
	    service.putTodo(todo,id);
	    return ResponseEntity.ok("resource updated");
	}
}
