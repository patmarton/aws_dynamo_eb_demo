package com.example.awstutorial.demo.resources;

import com.example.awstutorial.demo.entity.Person;
import com.example.awstutorial.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonResource {

    @Autowired
    private PersonRepository repository;

    @PostMapping("/savePerson")
    public Person savePerson(@RequestBody Person person){
        return repository.addPerson(person);
    }

    @GetMapping("/getPerson/{personId}")
    public Person findPerson(@PathVariable String personId){
        return repository.findPersonById(personId);
    }

    @DeleteMapping("/deletePerson")
    public String deletePerson(@RequestBody Person person){
        return repository.deletePerson(person);
    }

    @PutMapping("/editPerson")
    public String updatePerson(@RequestBody Person person){
        return repository.editPerson(person);
    }
}
