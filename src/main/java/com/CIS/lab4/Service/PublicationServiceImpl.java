package com.CIS.lab4.Service;

import com.CIS.lab4.Repository.PublicationRepository;
import com.CIS.lab4.model.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationServiceImpl implements PublicationService {

    @Autowired
    private PublicationRepository publicationRepository;

    @Override
    public Publication addPublication(Publication publication) {
        return publicationRepository.save(publication);
    }

    @Override
    public Publication getPublicationById(Long id) {
        return publicationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Publication> getAllPublications() {
        return publicationRepository.findAll();
    }

    @Override
    public void deletePublicationById(Long id) {
        publicationRepository.deleteById(id);
    }

    @Override
    public void deleteAllPublications() {
        publicationRepository.deleteAll();
    }

    @Override
    public Publication updatePublication(Long id, Publication publication) {
        if (publicationRepository.existsById(id)) {
            publication.setId(id);
            return publicationRepository.save(publication);
        }
        return null;
    }

    @Override
    public List<Publication> getPublicationsByAuthor(String author) {
        return publicationRepository.findByAuthor(author);
    }

    @Override
    public List<Publication> getPublicationsByPublisher(String publisher) {
        return publicationRepository.findByPublisher(publisher);
    }
}

