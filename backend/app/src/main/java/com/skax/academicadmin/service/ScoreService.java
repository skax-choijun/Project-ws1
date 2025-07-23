package com.skax.academicadmin.service;

import com.skax.academicadmin.domain.Score;
import com.skax.academicadmin.repository.ScoreMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ScoreService {
    private final ScoreMapper scoreMapper;
    public ScoreService(ScoreMapper scoreMapper) {
        this.scoreMapper = scoreMapper;
    }
    public List<Score> findAll() { return scoreMapper.findAll(); }
    public Score findById(Long id) { return scoreMapper.findById(id); }
    public void insert(Score score) { scoreMapper.insert(score); }
    public void update(Score score) { scoreMapper.update(score); }
    public void delete(Long id) { scoreMapper.delete(id); }
} 