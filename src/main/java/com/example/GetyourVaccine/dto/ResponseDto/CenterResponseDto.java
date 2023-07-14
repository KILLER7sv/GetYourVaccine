package com.example.GetyourVaccine.dto.ResponseDto;

import com.example.GetyourVaccine.Enum.CenterType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CenterResponseDto {
    String centerName;

    CenterType centerType;

    String address;
}
