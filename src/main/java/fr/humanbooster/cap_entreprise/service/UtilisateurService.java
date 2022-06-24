package fr.humanbooster.cap_entreprise.service;

import java.time.LocalDate;
import java.util.List;

import fr.humanbooster.cap_entreprise.business.Joueur;
import fr.humanbooster.cap_entreprise.business.Moderateur;
import fr.humanbooster.cap_entreprise.business.Utilisateur;

public interface UtilisateurService {

	Utilisateur ajouterJoueur(String pseudo, String email, String motDePasse, LocalDate dateDeNaissance);

	Utilisateur ajouterJoueur(Joueur joueur);

	Utilisateur ajouterModerateur(Moderateur moderateur);

	List<Joueur> recupererJoueurs();

	List<Moderateur> recupererModerateurs();

	List<Utilisateur> recupererUtilisateurs();

	Utilisateur recupererUtilisateur(String pseudo);
	
	Utilisateur recupererUtilisateur(String pseudo, String motDePasse);

	Utilisateur recupererUtilisateur(Long id);

	void supprimerUtilisateur(Long id);


}
