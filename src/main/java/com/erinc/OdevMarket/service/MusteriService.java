package com.erinc.OdevMarket.service;

import com.erinc.OdevMarket.dto.request.MusteriRequestDto;
import com.erinc.OdevMarket.mapper.IMusteriMapper;
import com.erinc.OdevMarket.repository.IMusteriRepository;
import com.erinc.OdevMarket.repository.entity.Musteri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusteriService {

    @Autowired
    private IMusteriRepository musteriRepository;
    public Musteri register(MusteriRequestDto dto) {
        Musteri musteri = IMusteriMapper.INSTANCE.toMusteri(dto);
        return musteriRepository.save(musteri);
    }
}
