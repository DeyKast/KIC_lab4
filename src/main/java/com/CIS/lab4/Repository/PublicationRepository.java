package com.CIS.lab4.Repository;

import com.CIS.lab4.model.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> {

    List<Publication> findByAuthor(String author);

    List<Publication> findByPublisher(String publisher);
}
