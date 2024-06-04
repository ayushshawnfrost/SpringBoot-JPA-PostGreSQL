package com.SpringJPA.AyushSharma.reminder;


import com.SpringJPA.AyushSharma.reminder.Reminder;
import com.SpringJPA.AyushSharma.reminder.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderService {

    @Autowired
    private ReminderRepository reminderRepository;

    public List<Reminder> findAll() {
        return reminderRepository.findAll();
    }

    public Reminder save(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    public void delete(Long id) {
        reminderRepository.deleteById(id);
    }

    public Reminder findById(Long id) {
        return reminderRepository.findById(id).orElse(null);
    }
}
