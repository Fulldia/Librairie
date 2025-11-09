package com.librairie.org.com.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.librairie.org.com.api.model.Livre;

@Repository
public class LivreRepository {
	
	private final List<Livre> livres = new ArrayList<>();
	
	public LivreRepository() {
		/*livres.add(new Livre(1, "Le Petit Prince", "Antoine de Saint-Exupéry"));
		livres.add(new Livre(2, "L'étranger", "Albert Camus"));*/
	}
	
	
	//retourner tous les livres
	public List<Livre> recupererTousLesLivres() {
		return livres;
	}
	
	//rechercher un livre par id
	public Livre rechercherLivreParId(Integer id) {
		return livres.stream()
				.filter(livre -> livre.getId().equals(id))
				.findFirst()
				.orElse(null);
	}

}
