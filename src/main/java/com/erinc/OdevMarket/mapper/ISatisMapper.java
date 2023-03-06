package com.erinc.OdevMarket.mapper;

import com.erinc.OdevMarket.dto.request.SatisRequestDto;
import com.erinc.OdevMarket.repository.entity.Satis;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ISatisMapper {

    ISatisMapper INSTANCE = Mappers.getMapper(ISatisMapper.class);

    Satis toSatis(final SatisRequestDto dto);

}
