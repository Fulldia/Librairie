package com.librairie.org.com.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.librairie.org.com.api.exception.LivreNotFoundException;
import com.librairie.org.com.api.model.Livre;
import com.librairie.org.com.api.repository.LivreRepository;

@RestController
@RequestMapping("/livres")
public class LivresController {
	
	private final LivreRepository livreRepository;

    public LivresController(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

	@GetMapping
	public List<Livre> recupererLivres() {
		List<Livre> livres = livreRepository.recupererTousLesLivres();
		if(!livres.isEmpty()) {
			return livres;
		} else {
			throw new LivreNotFoundException("La liste de livre est vide");
		}
		
	}
	
	@GetMapping("/{id}")
	public Livre rechercherLivreParId(@PathVariable Integer id) {
		Livre livre = livreRepository.rechercherLivreParId(id);
		if (livre != null) {
			return livre;
		}
		else {
	        throw new LivreNotFoundException("Livre avec l'id "+ id +" non trouvé");
		}
	}

}
