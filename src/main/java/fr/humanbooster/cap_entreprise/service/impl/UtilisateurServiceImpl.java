package fr.humanbooster.cap_entreprise.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.humanbooster.cap_entreprise.business.Joueur;
import fr.humanbooster.cap_entreprise.business.Moderateur;
import fr.humanbooster.cap_entreprise.business.Utilisateur;
import fr.humanbooster.cap_entreprise.dao.JoueurDao;
import fr.humanbooster.cap_entreprise.dao.ModerateurDao;
import fr.humanbooster.cap_entreprise.dao.UtilisateurDao;
import fr.humanbooster.cap_entreprise.service.UtilisateurService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {

	private final JoueurDao joueurDao;
	private final ModerateurDao moderateurDao;
	private final UtilisateurDao utilisateurDao;

	@Override
	public Utilisateur ajouterJoueur(String pseudo, String email, String motDePasse, LocalDate dateDeNaissance) {
		return joueurDao.save(new Joueur(pseudo, email, motDePasse, dateDeNaissance));
	}

	@Override
	public Utilisateur ajouterJoueur(Joueur joueur) {
		return joueurDao.save(joueur);
	}

	@Override
	public Utilisateur ajouterModerateur(Moderateur moderateur) {
		return moderateurDao.save(moderateur);
	}

	@Override
	public List<Joueur> recupererJoueurs() {
		return joueurDao.findAll();
	}

	@Override
	public List<Moderateur> recupererModerateurs() {
		return moderateurDao.findAll();
	}

	@Override
	public List<Utilisateur> recupererUtilisateurs() {
		return utilisateurDao.findAll();
	}

	/**
	 * On récupère l'utilisateur avec son pseudo et son mot de passe (connexion)
	 */
	@Override
	public Utilisateur recupererUtilisateur(String pseudo, String motDePasse) {
		return utilisateurDao.findByPseudoAndMotDePasse(pseudo, motDePasse);
	}

	@Override
	public Utilisateur recupererUtilisateur(Long id) {
		return utilisateurDao.findById(id).orElse(null);
	}

	@Override
	public void supprimerUtilisateur(Long id) {
		utilisateurDao.deleteById(id);
	}
}
