package com.SpringJPA.AyushSharma.reminder;


import com.SpringJPA.AyushSharma.reminder.Reminder;
import com.SpringJPA.AyushSharma.reminder.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reminders")
public class ReminderController {

    @Autowired
    private ReminderService reminderService;

    @GetMapping
    public List<Reminder> getAllReminders() {
        return reminderService.findAll();
    }

    @GetMapping("/{id}")
    public Reminder getReminderById(@PathVariable Long id) {
        return reminderService.findById(id);
    }

    @PostMapping
    public Reminder createReminder(@RequestBody Reminder reminder) {
        return reminderService.save(reminder);
    }

    @PutMapping("/{id}")
    public Reminder updateReminder(@PathVariable Long id, @RequestBody Reminder reminder) {
        reminder.setId(id);
        return reminderService.save(reminder);
    }

    @DeleteMapping("/{id}")
    public void deleteReminder(@PathVariable Long id) {
        reminderService.delete(id);
    }
}

