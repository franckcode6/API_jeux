package fr.humanbooster.cap_entreprise.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.humanbooster.cap_entreprise.business.ModeleEconomique;
import fr.humanbooster.cap_entreprise.service.ModeleEconomiqueService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ModeleEconomiqueRestController {

private final ModeleEconomiqueService modeleEconomiqueService;
	
	@GetMapping(value = "modeleEconomiques", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ModeleEconomique> modeleEconomiquesGet() {
		return modeleEconomiqueService.recupererModeleEconomiques();
	}
}
