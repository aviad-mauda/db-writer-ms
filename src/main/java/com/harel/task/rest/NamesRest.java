package com.harel.task.rest;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harel.task.db.DBModel;
import com.harel.task.service.NameService;

@RestController
@RequestMapping("/")
public class NamesRest {
	
	@Autowired
	NameService service;
	@PostMapping("/insert")
    public String insert(@RequestBody String name) throws IOException, URISyntaxException {
		DBModel document = new DBModel(name);
		DBModel saved = service.save(document);
		if(saved == null) {
			return "object with name " + saved.getName() + " was not saved.";
		}
		return "object with name " + saved.getName() + " was saved";
    }
}
