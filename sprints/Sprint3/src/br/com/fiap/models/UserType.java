package br.com.fiap.models;

public class UserType {
	
	private int id;
	private String name;
	
	public UserType() {
		super();
	}

	public UserType(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
