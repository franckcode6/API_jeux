package fr.humanbooster.cap_entreprise.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.humanbooster.cap_entreprise.business.Avis;
import fr.humanbooster.cap_entreprise.service.AvisService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class AvisRestController {

	private final AvisService avisService;

	@GetMapping(value = "avis", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Avis> avisGet() {
		return avisService.recupererAvis();
	}

	@GetMapping("avis/{id}")
	public Avis avisGetById(@PathVariable final Long id) {
		return avisService.recupererAvis(id);
	}

	@PostMapping(value = "avis")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Avis avisPost(@RequestBody Avis avis) {
		return avisService.ajouterAvis(avis);
	}

	@PatchMapping(value = "avis/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Avis avisUpdate(@RequestBody Avis avis) {
		return avisService.ajouterAvis(avis);
	}

	@DeleteMapping("avis/{id}")
	public void avisDelete(@PathVariable Long id) {
		avisService.supprimerAvis(id);
	}
}
