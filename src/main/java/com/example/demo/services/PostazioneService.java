package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import com.example.demo.entities.Postazione;
import com.example.demo.entities.TipoPost;
import com.example.demo.entities.Utente;

public class PostazioneService {
	private List<Postazione> postazioni = new ArrayList<>();

	public Postazione save(Postazione postazione) {
		Random rndm = new Random();
		postazione.setIdPostazione(rndm.nextLong());
		this.postazioni.add(postazione);
		return postazione;
	}

	public List<Postazione> getUtenti() {
		return this.postazioni;
	}
	
	public Optional<Postazione> findById(int id) {
		Postazione u = null;

		for (Postazione postazione : postazioni) {
			if (postazione.getIdPostazione() == id)
				u = postazione;
		}

		return Optional.ofNullable(u);
	}
	
//	public void findPostazione(TipoPost tipo, String citta) {
//        List<Postazione> postazione = postRepo.findByTipoAndEdificio_Citta(tipo, citta);
//        if (postazione != null) {
//        	for (Postazione postazioni : postazione) {
//        		log.info("Postazione trovata: " + postazioni.getIdPostazione() + " a: " + postazioni.getEdificio().getCitta());
//        	}
//        } else {
//        	log.info("Postazione non trovata");
//        }
//    }
}
