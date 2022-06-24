package fr.humanbooster.cap_entreprise.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.humanbooster.cap_entreprise.business.Joueur;
import fr.humanbooster.cap_entreprise.business.Moderateur;
import fr.humanbooster.cap_entreprise.business.Utilisateur;
import fr.humanbooster.cap_entreprise.service.UtilisateurService;
import lombok.AllArgsConstructor;

@RestController
@CrossOrigin
@RequestMapping("/api")
@AllArgsConstructor
public class UtilisateurRestController {

	private final UtilisateurService utilisateurService;

	@GetMapping(value = "joueurs", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Joueur> joueursGet() {
		return utilisateurService.recupererJoueurs();
	}

	@GetMapping(value = "moderateurs", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Moderateur> moderateursGet() {
		return utilisateurService.recupererModerateurs();
	}

	@GetMapping(value = "utilisateurs", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Utilisateur> utilisateursGet() {
		return utilisateurService.recupererUtilisateurs();
	}

	@GetMapping("utilisateurs/{id}")
	public Utilisateur utilisateurGetById(@PathVariable final Long id) {
		return utilisateurService.recupererUtilisateur(id);
	}
	
	@GetMapping("utilisateurs/pseudo/{pseudo}")
	public Utilisateur utilisateurGetByPseudo(@PathVariable final String pseudo) {
		return utilisateurService.recupererUtilisateur(pseudo);
	}

	@PostMapping(value = "joueurs")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Utilisateur joueurPost(@RequestBody Joueur joueur) {
		return utilisateurService.ajouterJoueur(joueur);
	}

	@PostMapping(value = "moderateurs")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Utilisateur moderateurPost(@RequestBody Moderateur moderateur) {
		return utilisateurService.ajouterModerateur(moderateur);
	}

	@PatchMapping(value = "joueur/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Utilisateur joueurUpdate(@RequestBody Joueur joueur) {
		return utilisateurService.ajouterJoueur(joueur);
	}

	@PatchMapping(value = "moderateur/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Utilisateur moderateurUpdate(@RequestBody Moderateur moderateur) {
		return utilisateurService.ajouterModerateur(moderateur);
	}

	@DeleteMapping("utilisateur/{id}")
	public void utilisateurDelete(@PathVariable Long id) {
		utilisateurService.supprimerUtilisateur(id);
	}

}
