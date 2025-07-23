package com.skax.academicadmin.controller;

import com.skax.academicadmin.domain.Evaluation;
import com.skax.academicadmin.service.EvaluationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/evaluations")
public class EvaluationController {
    private final EvaluationService evaluationService;
    public EvaluationController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }
    @GetMapping
    public List<Evaluation> getAll() { return evaluationService.findAll(); }
    @GetMapping("/{id}")
    public Evaluation getById(@PathVariable Long id) { return evaluationService.findById(id); }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Evaluation evaluation) {
        evaluationService.insert(evaluation);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Evaluation evaluation) {
        evaluation.setId(id);
        evaluationService.update(evaluation);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        evaluationService.delete(id);
        return ResponseEntity.ok().build();
    }
} 