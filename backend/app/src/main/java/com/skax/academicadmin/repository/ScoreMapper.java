package com.skax.academicadmin.repository;

import com.skax.academicadmin.domain.Score;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface ScoreMapper {
    @Select("SELECT id, applicant_id, subject, score_type, value, remarks FROM scores")
    List<Score> findAll();
    Score findById(Long id);
    void insert(Score score);
    void update(Score score);
    void delete(Long id);
} 