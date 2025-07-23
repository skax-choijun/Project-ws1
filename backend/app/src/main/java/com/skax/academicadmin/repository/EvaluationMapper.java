package com.skax.academicadmin.repository;

import com.skax.academicadmin.domain.Evaluation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface EvaluationMapper {
    @Select("SELECT id, applicant_id, item, weight, score, remarks FROM evaluations")
    List<Evaluation> findAll();
    Evaluation findById(Long id);
    void insert(Evaluation evaluation);
    void update(Evaluation evaluation);
    void delete(Long id);
} 