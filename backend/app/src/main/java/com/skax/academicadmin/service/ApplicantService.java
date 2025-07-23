package com.skax.academicadmin.service;

import com.skax.academicadmin.domain.Applicant;
import com.skax.academicadmin.repository.ApplicantMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApplicantService {
    private final ApplicantMapper applicantMapper;
    public ApplicantService(ApplicantMapper applicantMapper) {
        this.applicantMapper = applicantMapper;
    }
    public List<Applicant> findAll() { return applicantMapper.findAll(); }
    public Applicant findById(Long id) { return applicantMapper.findById(id); }
    public void insert(Applicant applicant) { applicantMapper.insert(applicant); }
    public void update(Applicant applicant) { applicantMapper.update(applicant); }
    public void delete(Long id) { applicantMapper.delete(id); }
} 