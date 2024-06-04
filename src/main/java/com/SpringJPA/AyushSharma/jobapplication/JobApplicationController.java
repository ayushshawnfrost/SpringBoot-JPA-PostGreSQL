package com.SpringJPA.AyushSharma.jobapplication;

import com.SpringJPA.AyushSharma.jobapplication.JobApplication;
import com.SpringJPA.AyushSharma.jobapplication.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class JobApplicationController {
    @Autowired
    private JobApplicationService jobApplicationService;

    @GetMapping
    public List<JobApplication> getAllApplications() {
        return jobApplicationService.findAll();
    }

    @GetMapping("/{id}")
    public JobApplication getApplicationById(@PathVariable Long id) {
        return jobApplicationService.findById(id);
    }

    @PostMapping
    public JobApplication createApplication(@RequestBody JobApplication jobApplication) {
        return jobApplicationService.save(jobApplication);
    }

    @PutMapping("/{id}")
    public JobApplication updateApplication(@PathVariable Long id, @RequestBody JobApplication jobApplication) {
        jobApplication.setId(id);
        return jobApplicationService.save(jobApplication);
    }

    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable Long id) {
        jobApplicationService.delete(id);
    }
}
