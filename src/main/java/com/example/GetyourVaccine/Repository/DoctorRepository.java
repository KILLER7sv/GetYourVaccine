package com.example.GetyourVaccine.Repository;

import com.example.GetyourVaccine.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
