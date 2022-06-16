package fr.humanbooster.cap_entreprise.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.humanbooster.cap_entreprise.business.Jeu;
import fr.humanbooster.cap_entreprise.service.JeuService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class JeuxRestController {

	private final JeuService jeuService;
	
	@GetMapping(value = "jeux")
	public List<Jeu> jeuxGet() {
		return jeuService.recupererJeux();
	}
	
//	@GetMapping("jeux/{id}")
//	public Jeu jeuGet(@PathVariable Long id) {
//		return jeuService.recupererJeu(id);
//	}
}
