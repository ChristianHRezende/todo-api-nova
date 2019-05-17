package br.com.chrezende.todoapinova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos")
public class Todo {
	@Id
	private String id;
	private String name;
	private Boolean isCompleted;

	public Todo() {
		super();
	}

	public Todo(String name, Boolean isCompleted) {
		super();
		this.name = name;
		this.isCompleted = isCompleted;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Todo{" + ", id='" + id + '\'' + ", name='" + name + '\'' + ", isCompleted=" + isCompleted + '}';
	}

}
