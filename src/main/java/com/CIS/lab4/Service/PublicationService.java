package com.CIS.lab4.Service;

import com.CIS.lab4.model.Publication;

import java.util.List;

public interface PublicationService {

    Publication addPublication(Publication publication);

    Publication getPublicationById(Long id);

    List<Publication> getAllPublications();

    void deletePublicationById(Long id);

    void deleteAllPublications();

    Publication updatePublication(Long id, Publication publication);

    List<Publication> getPublicationsByAuthor(String author);

    List<Publication> getPublicationsByPublisher(String publisher);
}

