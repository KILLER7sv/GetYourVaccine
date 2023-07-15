package com.example.GetyourVaccine.Service;

import com.example.GetyourVaccine.Model.VaccinationCenter;
import com.example.GetyourVaccine.Repository.VaccinationCenterRepository;
import com.example.GetyourVaccine.dto.RequestDto.CenterRequestDto;
import com.example.GetyourVaccine.dto.ResponseDto.CenterResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccinationCenterService {
    @Autowired
    VaccinationCenterRepository vaccinationCenterRepository;
    public CenterResponseDto addCenter(CenterRequestDto centerRequestDto) {

        // request dto to entity
        VaccinationCenter vaccinationCenter = new VaccinationCenter();
        vaccinationCenter.setCenterName(centerRequestDto.getCenterName());
        vaccinationCenter.setCenterType(centerRequestDto.getCenterType());
        vaccinationCenter.setAddress(centerRequestDto.getAddress());

        // save entity to db
        VaccinationCenter savedCenter = vaccinationCenterRepository.save(vaccinationCenter);


        //entity to response dto
        CenterResponseDto centerResponseDto= new CenterResponseDto();
        centerResponseDto.setCenterName(savedCenter.getCenterName());
        centerResponseDto.setCenterType(savedCenter.getCenterType());
        centerResponseDto.setAddress(savedCenter.getAddress());

        return centerResponseDto;

    }
}
