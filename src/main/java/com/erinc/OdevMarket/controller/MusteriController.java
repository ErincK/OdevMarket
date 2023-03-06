package com.erinc.OdevMarket.controller;

import com.erinc.OdevMarket.dto.request.MusteriRequestDto;
import com.erinc.OdevMarket.repository.entity.Musteri;
import com.erinc.OdevMarket.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/musteri")
@RequiredArgsConstructor
public class MusteriController {

    private final MusteriService musteriService;

    @PostMapping("/register")
    public ResponseEntity<Musteri> register(@RequestBody MusteriRequestDto dto){
        return ResponseEntity.ok(musteriService.register(dto));
    }

}
