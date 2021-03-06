package fr.humanbooster.cap_entreprise.business;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Avis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String description;

    private LocalDateTime dateEnvoi;

    @NotNull
    private float note;

    private LocalDateTime dateModeration;

    @JsonIgnore
    @ManyToOne
    private Moderateur moderateur;

    @ManyToOne
    private Joueur joueur;

    @NotNull
    @ManyToOne
    private Jeu jeu;

    public Avis(String description, LocalDateTime dateEnvoi, float note, Joueur joueur, Jeu jeu) {
        super();
        this.description = description;
        this.dateEnvoi = dateEnvoi;
        this.note = note;
        this.joueur = joueur;
        this.jeu = jeu;
    }

    @Override
    public String toString() {
        return dateEnvoi.getDayOfMonth() + "/" + dateEnvoi.getMonthValue() + "/" + dateEnvoi.getYear();
    }

}