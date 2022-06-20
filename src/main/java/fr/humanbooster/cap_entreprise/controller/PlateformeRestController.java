package fr.humanbooster.cap_entreprise.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.humanbooster.cap_entreprise.business.Plateforme;
import fr.humanbooster.cap_entreprise.service.PlateformeService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class PlateformeRestController {

private final PlateformeService plateformeService;
	
	@GetMapping(value = "plateformes", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Plateforme> plateformesGet() {
		return plateformeService.recupererPlateformes();
	}
}
