package com.skax.academicadmin.service;

import com.skax.academicadmin.domain.Evaluation;
import com.skax.academicadmin.repository.EvaluationMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EvaluationService {
    private final EvaluationMapper evaluationMapper;
    public EvaluationService(EvaluationMapper evaluationMapper) {
        this.evaluationMapper = evaluationMapper;
    }
    public List<Evaluation> findAll() { return evaluationMapper.findAll(); }
    public Evaluation findById(Long id) { return evaluationMapper.findById(id); }
    public void insert(Evaluation evaluation) { evaluationMapper.insert(evaluation); }
    public void update(Evaluation evaluation) { evaluationMapper.update(evaluation); }
    public void delete(Long id) { evaluationMapper.delete(id); }
} 