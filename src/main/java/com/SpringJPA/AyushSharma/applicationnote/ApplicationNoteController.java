package com.SpringJPA.AyushSharma.applicationnote;

import com.SpringJPA.AyushSharma.applicationnote.ApplicationNote;
import com.SpringJPA.AyushSharma.applicationnote.ApplicationNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class ApplicationNoteController {
    @Autowired
    private ApplicationNoteService applicationNoteService;

    @GetMapping
    public List<ApplicationNote> getAllNotes() {
        return applicationNoteService.findAll();
    }

    @GetMapping("/{id}")
    public ApplicationNote getNoteById(@PathVariable Long id) {
        return applicationNoteService.findById(id);
    }

    @PostMapping
    public ApplicationNote createNote(@RequestBody ApplicationNote applicationNote) {
        return applicationNoteService.save(applicationNote);
    }

    @PutMapping("/{id}")
    public ApplicationNote updateNote(@PathVariable Long id, @RequestBody ApplicationNote applicationNote) {
        applicationNote.setId(id);
        return applicationNoteService.save(applicationNote);
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Long id) {
        applicationNoteService.delete(id);
    }
}
