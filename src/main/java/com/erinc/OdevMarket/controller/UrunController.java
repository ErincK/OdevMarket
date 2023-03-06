package com.erinc.OdevMarket.controller;

import com.erinc.OdevMarket.dto.request.UrunRequestDto;
import com.erinc.OdevMarket.repository.entity.Urun;
import com.erinc.OdevMarket.service.UrunService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.erinc.OdevMarket.constants.EndPoints.SAVE;
import static com.erinc.OdevMarket.constants.EndPoints.URUN;

@RestController
@RequestMapping(URUN)
@RequiredArgsConstructor
public class UrunController {

    private final UrunService urunService;

    @PostMapping("/save")
    public ResponseEntity<Urun> addUrun(@RequestBody UrunRequestDto dto){
        return ResponseEntity.ok(urunService.addUrun(dto));
    }









}
