package com.erinc.OdevMarket.dto.request;

import lombok.*;



@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UrunRequestDto {

    String urunAdi;
    String marka;
    Double fiyat;




}
