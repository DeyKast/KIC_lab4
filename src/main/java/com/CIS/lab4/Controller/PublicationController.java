package com.CIS.lab4.Controller;

import com.CIS.lab4.Service.PublicationService;
import com.CIS.lab4.model.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publications")
public class PublicationController {

    @Autowired
    private PublicationService publicationService;

    @PostMapping
    public Publication addPublication(@RequestBody Publication publication) {
        return publicationService.addPublication(publication);
    }

    @GetMapping("/{id}")
    public Publication getPublicationById(@PathVariable Long id) {
        return publicationService.getPublicationById(id);
    }

    @GetMapping
    public List<Publication> getAllPublications() {
        return publicationService.getAllPublications();
    }

    @DeleteMapping("/{id}")
    public void deletePublicationById(@PathVariable Long id) {
        publicationService.deletePublicationById(id);
    }

    @DeleteMapping
    public void deleteAllPublications() {
        publicationService.deleteAllPublications();
    }

    @PutMapping("/{id}")
    public Publication updatePublication(@PathVariable Long id, @RequestBody Publication publication) {
        return publicationService.updatePublication(id, publication);
    }

    @GetMapping("/author/{author}")
    public List<Publication> getPublicationsByAuthor(@PathVariable String author) {
        return publicationService.getPublicationsByAuthor(author);
    }

    @GetMapping("/publisher/{publisher}")
    public List<Publication> getPublicationsByPublisher(@PathVariable String publisher) {
        return publicationService.getPublicationsByPublisher(publisher);
    }
}
