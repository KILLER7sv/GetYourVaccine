package com.example.GetyourVaccine.Repository;

import com.example.GetyourVaccine.Model.Appointment;
import com.example.GetyourVaccine.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
}