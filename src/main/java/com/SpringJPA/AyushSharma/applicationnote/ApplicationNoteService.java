package com.SpringJPA.AyushSharma.applicationnote;


import com.SpringJPA.AyushSharma.applicationnote.ApplicationNote;
import com.SpringJPA.AyushSharma.applicationnote.ApplicationNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationNoteService {
    @Autowired
    private ApplicationNoteRepository applicationNoteRepository;

    public List<ApplicationNote> findAll() {
        return applicationNoteRepository.findAll();
    }

    public ApplicationNote save(ApplicationNote applicationNote) {
        return applicationNoteRepository.save(applicationNote);
    }

    public void delete(Long id) {
        applicationNoteRepository.deleteById(id);
    }

    public ApplicationNote findById(Long id) {
        return applicationNoteRepository.findById(id).orElse(null);
    }
}
