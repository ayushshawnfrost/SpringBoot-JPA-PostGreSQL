package com.SpringJPA.AyushSharma.reminder;

import com.SpringJPA.AyushSharma.jobapplication.JobApplication;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reminders")
public class Reminder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "application_id", nullable = false)
    private JobApplication jobApplication;

    private String description;
    private LocalDateTime reminderDate;

    @PrePersist
    protected void onCreate() {
        reminderDate = LocalDateTime.now();
    }
}
