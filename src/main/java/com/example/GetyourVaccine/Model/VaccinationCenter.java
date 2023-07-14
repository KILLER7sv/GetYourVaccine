package com.example.GetyourVaccine.Model;


import com.example.GetyourVaccine.Enum.CenterType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VaccinationCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String centerName;

    CenterType centerType;

    String address;

    @OneToMany(mappedBy = "center" , cascade = CascadeType.ALL)
    List<Doctor> doctors = new ArrayList<>();
}