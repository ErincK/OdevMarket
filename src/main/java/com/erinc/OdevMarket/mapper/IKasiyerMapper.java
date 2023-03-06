package com.erinc.OdevMarket.mapper;

import com.erinc.OdevMarket.dto.request.KasiyerRequestDto;
import com.erinc.OdevMarket.repository.entity.Kasiyer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IKasiyerMapper {

    IKasiyerMapper INSTANCE = Mappers.getMapper(IKasiyerMapper.class);

    Kasiyer toKasiyer(final KasiyerRequestDto dto);


}
