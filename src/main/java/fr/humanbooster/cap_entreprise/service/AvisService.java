package fr.humanbooster.cap_entreprise.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fr.humanbooster.cap_entreprise.business.Avis;
import fr.humanbooster.cap_entreprise.business.Jeu;
import fr.humanbooster.cap_entreprise.business.Joueur;
import fr.humanbooster.cap_entreprise.business.Moderateur;

public interface AvisService {

	Avis ajouterAvis(String description, LocalDateTime dateEnvoi, float note, Joueur joueur, Jeu jeu);

	Avis ajouterAvis(Avis avis);

	List<Avis> recupererAvis();

	Avis recupererAvis(Long id);

	Page<Avis> recupererAvisJoueurs(String pseudoJoueur, Pageable pageable);

	Page<Avis> recupererAvisModeres(Pageable pageable);

	Page<Avis> recupererAvisAModerer(Pageable pageable);

	Page<Avis> recupererAvis(Pageable pageable);

	Avis validerAvis(Long id, String description, LocalDateTime dateEnvoi, float note, LocalDateTime dateModeration,
			Moderateur moderateur, Joueur joueur, Jeu jeu);

	void supprimerAvis(Long id);

}