package com.erinc.OdevMarket.service;

import com.erinc.OdevMarket.dto.request.UrunRequestDto;
import com.erinc.OdevMarket.mapper.IUrunMapper;
import com.erinc.OdevMarket.repository.IUrunRepository;
import com.erinc.OdevMarket.repository.entity.Urun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UrunService {

    @Autowired
    private IUrunRepository urunRepository;


    public Urun addUrun(@RequestBody UrunRequestDto dto) {
        Urun urun = IUrunMapper.INSTANCE.toUrun(dto);
        return urunRepository.save(urun);
    }
}
