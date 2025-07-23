package com.skax.academicadmin.repository;

import com.skax.academicadmin.domain.Application;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface ApplicationMapper {
    @Select("SELECT id, applicant_id, submitted_at, status, remarks FROM applications")
    List<Application> findAll();
    Application findById(Long id);
    void insert(Application application);
    void update(Application application);
    void delete(Long id);
} 