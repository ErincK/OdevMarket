package com.erinc.OdevMarket.controller;

import com.erinc.OdevMarket.dto.request.SatisRequestDto;
import com.erinc.OdevMarket.repository.ISatisRepository;
import com.erinc.OdevMarket.repository.entity.Satis;
import com.erinc.OdevMarket.service.KasiyerService;
import com.erinc.OdevMarket.service.MusteriService;
import com.erinc.OdevMarket.service.SatisService;
import com.erinc.OdevMarket.service.UrunService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.erinc.OdevMarket.constants.EndPoints.*;

@RestController
@RequestMapping(SATIS)
@RequiredArgsConstructor
public class SatisController {

    private final SatisService satisService;

    @Autowired
    private MusteriService musteriService;

    @Autowired
    private KasiyerService kasiyerService;

    @Autowired
    private UrunService urunService;


    @PostMapping(SAVE)
    public ResponseEntity<Satis> saveSatis(@RequestBody SatisRequestDto dto){
        return ResponseEntity.ok(satisService.saveSatis(dto));
    }






}
