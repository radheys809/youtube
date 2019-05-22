package com.example.logging;

public class Article {
	private int id;
    private String name;
 
 
    public Article(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
 
    public int getId() {
        return id;
    }
    public Article  setId(int id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
