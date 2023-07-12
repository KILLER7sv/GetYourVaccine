package com.example.GetyourVaccine.Repository;

import com.example.GetyourVaccine.Model.Dose;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoseRepository extends JpaRepository<Dose, Integer> {
}
