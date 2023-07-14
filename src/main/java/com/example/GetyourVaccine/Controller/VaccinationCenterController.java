package com.example.GetyourVaccine.Controller;

import com.example.GetyourVaccine.dto.RequestDto.CenterRequestDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/center")
public class VaccinationCenterController {
    public addCenter(@RequestBody CenterRequestDto centerRequestDto)
}
