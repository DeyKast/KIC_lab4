package com.CIS.lab4;

import com.CIS.lab4.Repository.PublicationRepository;
import com.CIS.lab4.model.Publication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab4Application {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Lab4Application.class, args);

		PublicationRepository publicationRepository = context.getBean(PublicationRepository.class);

		// Create and save Publication objects
		Publication publication1 = new Publication("How to JS", "Ricardo M.", 2023, "SmartBook", 312);
		Publication publication2 = new Publication("How to Java", "Eren E.", 2022, "SmartRead", 394);

		publicationRepository.save(publication1);
		publicationRepository.save(publication2);
	}
}
