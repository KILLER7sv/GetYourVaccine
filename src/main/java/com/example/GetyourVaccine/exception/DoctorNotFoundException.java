package com.example.GetyourVaccine.exception;

public class DoctorNotFoundException extends RuntimeException{

    public DoctorNotFoundException(String message){
        super(message);
    }
}
