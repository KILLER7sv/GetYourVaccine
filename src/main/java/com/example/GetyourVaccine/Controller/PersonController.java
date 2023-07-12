package com.example.GetyourVaccine.Controller;

import com.example.GetyourVaccine.Service.PersonService;
import com.example.GetyourVaccine.dto.RequestDto.AddPersonRequestDto;
import com.example.GetyourVaccine.dto.ResponseDto.AddPersonResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/add")
    public ResponseEntity addPerson(@RequestBody AddPersonRequestDto addPersonRequestDto){
        try{
            AddPersonResponseDto personResponse = personService.addPerson(addPersonRequestDto);
            return new ResponseEntity(personResponse, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity("Email already exists",HttpStatus.BAD_REQUEST);
        }
    }
}