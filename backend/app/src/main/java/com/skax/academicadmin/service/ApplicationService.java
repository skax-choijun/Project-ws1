package com.skax.academicadmin.service;

import com.skax.academicadmin.domain.Application;
import com.skax.academicadmin.repository.ApplicationMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApplicationService {
    private final ApplicationMapper applicationMapper;
    public ApplicationService(ApplicationMapper applicationMapper) {
        this.applicationMapper = applicationMapper;
    }
    public List<Application> findAll() { return applicationMapper.findAll(); }
    public Application findById(Long id) { return applicationMapper.findById(id); }
    public void insert(Application application) { applicationMapper.insert(application); }
    public void update(Application application) { applicationMapper.update(application); }
    public void delete(Long id) { applicationMapper.delete(id); }
} 