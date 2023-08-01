package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Utente;

@Service
public class UtenteService {
	private List<Utente> utenti = new ArrayList<>();

	public Utente save(Utente utente) {
		Random rndm = new Random();
		utente.setId(rndm.nextLong());
		this.utenti.add(utente);
		return utente;
	}

	public List<Utente> getUtenti() {
		return this.utenti;
	}
	
	
	public Optional<Utente> findById(int id) {
		Utente u = null;

		for (Utente utente : utenti) {
			if (utente.getId() == id)
				u = utente;
		}

		return Optional.ofNullable(u);
	}
}
