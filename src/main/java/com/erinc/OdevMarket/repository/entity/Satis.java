package com.erinc.OdevMarket.repository.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblsatis")
public class Satis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String urunid;
    String musteriid;
    String kasiyerid;
    String kasiyerAd;
    String kasiyerSoyad;
    String musteriAd;
    String musteriSoyad;
    String urunAdi;
    String urunMarka;
    Integer urunMiktari;
    Double urunFiyati;
    Double toplamFiyat;
    Date date;
}
