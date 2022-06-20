package fr.humanbooster.cap_entreprise.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.humanbooster.cap_entreprise.business.Genre;
import fr.humanbooster.cap_entreprise.service.GenreService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class GenreRestController {

private final GenreService genreService;
	
	@GetMapping(value = "genres", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Genre> genresGet() {
		return genreService.recupererGenres();
	}
}
