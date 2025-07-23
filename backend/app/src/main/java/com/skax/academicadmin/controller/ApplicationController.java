package com.skax.academicadmin.controller;

import com.skax.academicadmin.domain.Application;
import com.skax.academicadmin.service.ApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {
    private final ApplicationService applicationService;
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }
    @GetMapping
    public List<Application> getAll() { return applicationService.findAll(); }
    @GetMapping("/{id}")
    public Application getById(@PathVariable Long id) { return applicationService.findById(id); }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Application application) {
        applicationService.insert(application);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Application application) {
        application.setId(id);
        applicationService.update(application);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        applicationService.delete(id);
        return ResponseEntity.ok().build();
    }
} 