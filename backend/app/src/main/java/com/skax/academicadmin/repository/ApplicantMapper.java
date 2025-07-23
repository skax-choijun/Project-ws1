package com.skax.academicadmin.repository;

import com.skax.academicadmin.domain.Applicant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface ApplicantMapper {
    @Select("SELECT id, name, birth_date, email, phone FROM applicants")
    List<Applicant> findAll();
    Applicant findById(Long id);
    void insert(Applicant applicant);
    void update(Applicant applicant);
    void delete(Long id);
} 