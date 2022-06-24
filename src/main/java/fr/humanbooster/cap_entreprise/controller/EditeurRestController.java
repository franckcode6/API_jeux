package fr.humanbooster.cap_entreprise.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.humanbooster.cap_entreprise.business.Editeur;
import fr.humanbooster.cap_entreprise.service.EditeurService;
import lombok.AllArgsConstructor;

@RestController
@CrossOrigin
@RequestMapping("/api")
@AllArgsConstructor
public class EditeurRestController {
	
private final EditeurService editeurService;
	
	@GetMapping(value = "editeurs", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Editeur> editeursGet() {
		return editeurService.recupererEditeurs();
	}

}
