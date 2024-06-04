package com.SpringJPA.AyushSharma.jobapplication;
import com.SpringJPA.AyushSharma.jobapplication.JobApplication;
import com.SpringJPA.AyushSharma.jobapplication.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {

    @Autowired
    private JobApplicationRepository jobApplicationRepository;

    public List<JobApplication> findAll() {
        return jobApplicationRepository.findAll();
    }

    public JobApplication save(JobApplication jobApplication) {
        return jobApplicationRepository.save(jobApplication);
    }

    public void delete(Long id) {
        jobApplicationRepository.deleteById(id);
    }

    public JobApplication findById(Long id) {
        return jobApplicationRepository.findById(id).orElse(null);
    }
}
