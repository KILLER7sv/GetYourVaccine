package com.example.GetyourVaccine.Controller;

import com.example.GetyourVaccine.Model.VaccinationCenter;
import com.example.GetyourVaccine.Service.VaccinationCenterService;
import com.example.GetyourVaccine.dto.RequestDto.CenterRequestDto;
import com.example.GetyourVaccine.dto.ResponseDto.CenterResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/center")
public class VaccinationCenterController {

    @Autowired
    VaccinationCenterService vaccinationCenterService;

    @PostMapping("/add")
    public CenterResponseDto addCenter(@RequestBody CenterRequestDto centerRequestDto){
        CenterResponseDto centerResponseDto = vaccinationCenterService.addCenter(centerRequestDto);
        return centerResponseDto;
    }
}
