package com.erinc.OdevMarket.service;

import com.erinc.OdevMarket.dto.request.SatisRequestDto;
import com.erinc.OdevMarket.mapper.ISatisMapper;
import com.erinc.OdevMarket.repository.ISatisRepository;
import com.erinc.OdevMarket.repository.entity.Satis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SatisService {
    @Autowired
    private ISatisRepository satisRepository;


    public Satis saveSatis(SatisRequestDto dto) {
        Satis satis = ISatisMapper.INSTANCE.toSatis(dto);
        return satisRepository.save(satis);
    }
}
