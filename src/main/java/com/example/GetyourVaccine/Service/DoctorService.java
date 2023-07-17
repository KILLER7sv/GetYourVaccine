package com.example.GetyourVaccine.Service;

import com.example.GetyourVaccine.Model.Doctor;
import com.example.GetyourVaccine.Model.VaccinationCenter;
import com.example.GetyourVaccine.Repository.DoctorRepository;
import com.example.GetyourVaccine.Repository.VaccinationCenterRepository;
import com.example.GetyourVaccine.dto.RequestDto.DoctorRequestDto;
import com.example.GetyourVaccine.dto.ResponseDto.CenterResponseDto;
import com.example.GetyourVaccine.dto.ResponseDto.DoctorResponseDto;
import com.example.GetyourVaccine.exception.CenterNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {
    @Autowired
    VaccinationCenterRepository vaccinationCenterRepository;

    @Autowired
    DoctorRepository doctorRepository;
    public DoctorResponseDto addDoctor(DoctorRequestDto doctorRequestDto) {
        Optional<VaccinationCenter> vaccinationCenterOptional = vaccinationCenterRepository.findById(
                doctorRequestDto.getCenterId());
        if(vaccinationCenterOptional == null){
            throw new CenterNotFoundException("Sorry! Invalid centerId");
        }

        VaccinationCenter center = vaccinationCenterOptional.get();

        //create doctor entity
        Doctor doctor = new Doctor();
        doctor.setName(doctorRequestDto.getName());
        doctor.setAge(doctorRequestDto.getAge());
        doctor.setEmailId(doctorRequestDto.getEmailId());
        doctor.setGender(doctorRequestDto.getGender());
        doctor.setCenter(center);

        //add in center doctor list

        center.getDoctors().add(doctor);
        VaccinationCenter savedVaccinationCenter = vaccinationCenterRepository.save(center); // saves both as we save the parent

        // prepare response dto
        List<Doctor> doctors = savedVaccinationCenter.getDoctors();
        // doctor response
        DoctorResponseDto doctorResponseDto = new DoctorResponseDto();
        doctorResponseDto.setName(doctors.get(doctors.size()-1).getName());
        doctorResponseDto.setMessage("Congrats!! you have been registered!");

        // center response
        CenterResponseDto centerResponseDto = new CenterResponseDto();
        centerResponseDto.setCenterType(savedVaccinationCenter.getCenterType());
        centerResponseDto.setAddress(savedVaccinationCenter.getAddress());
        centerResponseDto.setCenterName(savedVaccinationCenter.getCenterName());

        doctorResponseDto.setCenterResponseDto(centerResponseDto);

        return doctorResponseDto;
    }

    public List<String> getByAgeGreaterThan(int age){
        List<Doctor> doctors = doctorRepository.getByAgeGreaterThan(age);
        List<String> ans = new ArrayList<>();

        for(Doctor d : doctors){
            ans.add(d.getName());
        }
        return ans;
    }
}
