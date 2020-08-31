package com.example.awstutorial.demo.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.awstutorial.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {

    @Autowired
    private DynamoDBMapper mapper;

    public Person addPerson(Person person){
        mapper.save(person);
        return person;
    }

    public Person findPersonById(String id){
        return mapper.load(Person.class,id);
    }


}
