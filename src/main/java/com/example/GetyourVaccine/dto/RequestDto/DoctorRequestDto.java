package com.example.GetyourVaccine.dto.RequestDto;

import com.example.GetyourVaccine.Enum.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DoctorRequestDto {

    Integer centerId;

    String name;

    int age;

    String emailId;

    Gender gender;
}
