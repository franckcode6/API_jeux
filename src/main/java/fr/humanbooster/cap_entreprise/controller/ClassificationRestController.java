package fr.humanbooster.cap_entreprise.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.humanbooster.cap_entreprise.business.Classification;
import fr.humanbooster.cap_entreprise.service.ClassificationService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ClassificationRestController {

	private final ClassificationService classificationService;
	
	@GetMapping(value = "classifications", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Classification> classificationsGet() {
		return classificationService.recupererClassifications();
	}
}
