package com.huyduc.manage.service.mapper;

import com.huyduc.manage.bean.Years;
import com.huyduc.manage.service.dto.YearsDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-06-04T03:25:50+0700",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class YearsMapperImpl implements YearsMapper {

    @Override
    public Years toEntity(YearsDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Years years = new Years();

        years.setId( dto.getId() );
        years.setName( dto.getName() );
        years.setStartYears( dto.getStartYears() );
        years.setOpenDay( dto.getOpenDay() );
        years.setCloseDay( dto.getCloseDay() );
        years.setDescribe( dto.getDescribe() );
        years.setMaximumClasses( dto.getMaximumClasses() );
        years.setStatus( dto.isStatus() );

        return years;
    }

    @Override
    public YearsDTO toDto(Years entity) {
        if ( entity == null ) {
            return null;
        }

        YearsDTO yearsDTO = new YearsDTO();

        yearsDTO.setId( entity.getId() );
        yearsDTO.setName( entity.getName() );
        yearsDTO.setStartYears( entity.getStartYears() );
        yearsDTO.setOpenDay( entity.getOpenDay() );
        yearsDTO.setCloseDay( entity.getCloseDay() );
        yearsDTO.setDescribe( entity.getDescribe() );
        yearsDTO.setMaximumClasses( entity.getMaximumClasses() );
        yearsDTO.setStatus( entity.isStatus() );

        return yearsDTO;
    }

    @Override
    public List<Years> toEntity(List<YearsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Years> list = new ArrayList<Years>();
        for ( YearsDTO yearsDTO : dtoList ) {
            list.add( toEntity( yearsDTO ) );
        }

        return list;
    }

    @Override
    public List<YearsDTO> toDto(List<Years> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<YearsDTO> list = new ArrayList<YearsDTO>();
        for ( Years years : entityList ) {
            list.add( toDto( years ) );
        }

        return list;
    }
}
