package com.huyduc.manage.service.mapper;

import com.huyduc.manage.bean.Course;
import com.huyduc.manage.service.dto.CourseDTO;
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
public class CourseMapperImpl implements CourseMapper {

    @Override
    public Course toEntity(CourseDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Course course = new Course();

        course.setId( dto.getId() );
        course.setName( dto.getName() );
        course.setMaxClasses( dto.getMaxClasses() );
        course.setDateOpen( dto.getDateOpen() );
        course.setDateClose( dto.getDateClose() );
        course.setStatus( dto.isStatus() );

        return course;
    }

    @Override
    public CourseDTO toDto(Course entity) {
        if ( entity == null ) {
            return null;
        }

        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setId( entity.getId() );
        courseDTO.setName( entity.getName() );
        courseDTO.setMaxClasses( entity.getMaxClasses() );
        courseDTO.setDateOpen( entity.getDateOpen() );
        courseDTO.setDateClose( entity.getDateClose() );
        courseDTO.setStatus( entity.isStatus() );

        return courseDTO;
    }

    @Override
    public List<Course> toEntity(List<CourseDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Course> list = new ArrayList<Course>();
        for ( CourseDTO courseDTO : dtoList ) {
            list.add( toEntity( courseDTO ) );
        }

        return list;
    }

    @Override
    public List<CourseDTO> toDto(List<Course> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CourseDTO> list = new ArrayList<CourseDTO>();
        for ( Course course : entityList ) {
            list.add( toDto( course ) );
        }

        return list;
    }
}
