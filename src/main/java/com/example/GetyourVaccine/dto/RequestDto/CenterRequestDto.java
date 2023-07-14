package com.example.GetyourVaccine.dto.RequestDto;

import com.example.GetyourVaccine.Enum.CenterType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CenterRequestDto {
    String centerName;

    CenterType centerType;

    String address;
}
