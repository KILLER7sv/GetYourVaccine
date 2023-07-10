package com.example.GetyourVaccine.Controller;

import com.example.GetyourVaccine.Model.Person;
import com.example.GetyourVaccine.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    public ResponseEntity addPerson(@RequestBody Person person){
        try {
            Person personResponse = personService.addPerson(person);
            return new ResponseEntity(personResponse , HttpStatus.CREATED);
        }
        catch(Exception e){
            return new ResponseEntity("Email already exists" , HttpStatus.BAD_REQUEST);
        }
    }
}
