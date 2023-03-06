package com.erinc.OdevMarket.service;

import com.erinc.OdevMarket.dto.request.KasiyerRequestDto;
import com.erinc.OdevMarket.dto.request.UrunRequestDto;
import com.erinc.OdevMarket.mapper.IKasiyerMapper;
import com.erinc.OdevMarket.mapper.IUrunMapper;
import com.erinc.OdevMarket.repository.IKasiyerRepository;
import com.erinc.OdevMarket.repository.entity.Kasiyer;
import com.erinc.OdevMarket.repository.entity.Urun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class KasiyerService {

    @Autowired
    private IKasiyerRepository kasiyerRepository;



    public Kasiyer addKasiyer(KasiyerRequestDto dto) {
        Kasiyer kasiyer = IKasiyerMapper.INSTANCE.toKasiyer(dto);
        return kasiyerRepository.save(kasiyer);
    }
}
