package com.skax.academicadmin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.skax.academicadmin.domain.Applicant;
import com.skax.academicadmin.service.ApplicantService;

import java.util.List;

@RestController
@RequestMapping("/api/applicants")
public class ApplicantController {
    private final ApplicantService applicantService;
    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }
    @GetMapping
    public List<Applicant> getAll() { return applicantService.findAll(); }
    @GetMapping("/{id}")
    public Applicant getById(@PathVariable Long id) { return applicantService.findById(id); }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Applicant applicant) {
        applicantService.insert(applicant);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Applicant applicant) {
        applicant.setId(id);
        applicantService.update(applicant);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        applicantService.delete(id);
        return ResponseEntity.ok().build();
    }
} 