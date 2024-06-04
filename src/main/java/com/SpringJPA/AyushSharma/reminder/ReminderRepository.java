package com.SpringJPA.AyushSharma.reminder;

import com.SpringJPA.AyushSharma.reminder.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder, Long> {
}
