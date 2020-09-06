package com.harel.task.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.harel.task.db.DBModel;

@Repository
public class NameRepository {

	@Autowired 
	MongoTemplate mongoTemplate;
	
	public DBModel save(DBModel document) {
		return mongoTemplate.save(document);
	}
}
