package com.SpringJPA.AyushSharma.document;

import com.SpringJPA.AyushSharma.document.Document;
import com.SpringJPA.AyushSharma.document.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    public List<Document> findAll() {
        return documentRepository.findAll();
    }

    public Document save(Document document) {
        return documentRepository.save(document);
    }

    public void delete(Long id) {
        documentRepository.deleteById(id);
    }

    public Document findById(Long id) {
        return documentRepository.findById(id).orElse(null);
    }
}
