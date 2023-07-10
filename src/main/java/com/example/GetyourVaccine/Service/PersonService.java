package com.example.GetyourVaccine.Service;

import com.example.GetyourVaccine.Model.Person;
import com.example.GetyourVaccine.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;
    public Person addPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return savedPerson;
    }
}
