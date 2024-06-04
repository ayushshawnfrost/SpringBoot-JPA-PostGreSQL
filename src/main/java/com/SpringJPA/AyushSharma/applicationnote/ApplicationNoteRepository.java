package com.SpringJPA.AyushSharma.applicationnote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationNoteRepository extends JpaRepository<ApplicationNote, Long>{
}
