package com.erinc.OdevMarket.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MusteriRequestDto {
    String ad;
    String soyad;
    String email;
}
