package com.erinc.OdevMarket.mapper;

import com.erinc.OdevMarket.dto.request.UrunRequestDto;
import com.erinc.OdevMarket.repository.entity.Urun;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUrunMapper {
    IUrunMapper INSTANCE = Mappers.getMapper(IUrunMapper.class);

    Urun toUrun(final UrunRequestDto dto);


}
