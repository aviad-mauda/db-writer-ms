package com.harel.task.db;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "names")
public class DBModel {
	    private String name;
	    
	    public DBModel(String name) {
	    	this.name = name;
	    }
}
