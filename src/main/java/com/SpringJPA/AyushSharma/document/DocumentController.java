package com.SpringJPA.AyushSharma.document;

import com.SpringJPA.AyushSharma.document.Document;
import com.SpringJPA.AyushSharma.document.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentController {
    @Autowired
    private DocumentService documentService;

    @GetMapping
    public List<Document> getAllDocuments() {
        return documentService.findAll();
    }

    @GetMapping("/{id}")
    public Document getDocumentById(@PathVariable Long id) {
        return documentService.findById(id);
    }

    @PostMapping
    public Document createDocument(@RequestBody Document document) {
        return documentService.save(document);
    }

    @PutMapping("/{id}")
    public Document updateDocument(@PathVariable Long id, @RequestBody Document document) {
        document.setId(id);
        return documentService.save(document);
    }

    @DeleteMapping("/{id}")
    public void deleteDocument(@PathVariable Long id) {
        documentService.delete(id);
    }
}
