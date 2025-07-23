package com.skax.academicadmin.controller;

import com.skax.academicadmin.domain.Score;
import com.skax.academicadmin.service.ScoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/scores")
public class ScoreController {
    private final ScoreService scoreService;
    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }
    @GetMapping
    public List<Score> getAll() { return scoreService.findAll(); }
    @GetMapping("/{id}")
    public Score getById(@PathVariable Long id) { return scoreService.findById(id); }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Score score) {
        scoreService.insert(score);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Score score) {
        score.setId(id);
        scoreService.update(score);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        scoreService.delete(id);
        return ResponseEntity.ok().build();
    }
} 