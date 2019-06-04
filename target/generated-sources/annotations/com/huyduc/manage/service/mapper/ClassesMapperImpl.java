package com.huyduc.manage.service.mapper;

import com.huyduc.manage.bean.Classes;
import com.huyduc.manage.service.dto.ClassesDTO;
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
public class ClassesMapperImpl implements ClassesMapper {

    @Override
    public Classes toEntity(ClassesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Classes classes = new Classes();

        classes.setId( dto.getId() );
        classes.setClassCode( dto.getClassCode() );
        classes.setName( dto.getName() );
        classes.setDescribe( dto.getDescribe() );
        classes.setOpenDay( dto.getOpenDay() );
        classes.setCloseDay( dto.getCloseDay() );
        classes.setStatus( dto.isStatus() );
        classes.setClassRoom( dto.getClassRoom() );

        return classes;
    }

    @Override
    public ClassesDTO toDto(Classes entity) {
        if ( entity == null ) {
            return null;
        }

        ClassesDTO classesDTO = new ClassesDTO();

        classesDTO.setId( entity.getId() );
        classesDTO.setName( entity.getName() );
        classesDTO.setDescribe( entity.getDescribe() );
        classesDTO.setOpenDay( entity.getOpenDay() );
        classesDTO.setCloseDay( entity.getCloseDay() );
        classesDTO.setStatus( entity.isStatus() );
        classesDTO.setClassCode( entity.getClassCode() );
        classesDTO.setClassRoom( entity.getClassRoom() );

        return classesDTO;
    }

    @Override
    public List<Classes> toEntity(List<ClassesDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Classes> list = new ArrayList<Classes>();
        for ( ClassesDTO classesDTO : dtoList ) {
            list.add( toEntity( classesDTO ) );
        }

        return list;
    }

    @Override
    public List<ClassesDTO> toDto(List<Classes> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ClassesDTO> list = new ArrayList<ClassesDTO>();
        for ( Classes classes : entityList ) {
            list.add( toDto( classes ) );
        }

        return list;
    }
}
