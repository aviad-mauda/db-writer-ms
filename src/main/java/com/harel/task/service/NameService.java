package com.harel.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harel.task.db.DBModel;
import com.harel.task.repository.NameRepository;

@Service
public class NameService {

	@Autowired
	NameRepository nameRepository;

	public DBModel save(DBModel document) {
		return nameRepository.save(document);
	}
}
