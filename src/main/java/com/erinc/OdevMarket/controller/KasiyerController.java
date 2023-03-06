package com.erinc.OdevMarket.controller;

import com.erinc.OdevMarket.dto.request.KasiyerRequestDto;
import com.erinc.OdevMarket.dto.request.UrunRequestDto;
import com.erinc.OdevMarket.repository.entity.Kasiyer;
import com.erinc.OdevMarket.repository.entity.Urun;
import com.erinc.OdevMarket.service.KasiyerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/kasiyer")
@RequiredArgsConstructor
public class KasiyerController {

    private final KasiyerService kasiyerService;

    @PostMapping("/save")
    public ResponseEntity<Kasiyer> addKasiyer(@RequestBody KasiyerRequestDto dto){
        return ResponseEntity.ok(kasiyerService.addKasiyer(dto));
    }








}
