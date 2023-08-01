package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.demo.entities.Prenotazione;

public class PrenotazioneService {
	private List<Prenotazione> prenotazioni = new ArrayList<>();

	public Prenotazione save(Prenotazione prenotazione) {
		Random rndm = new Random();
		prenotazione.setId(rndm.nextLong());
		this.prenotazioni.add(prenotazione);
		return prenotazione;
	}

	public List<Prenotazione> getUtenti() {
		return this.prenotazioni;
	}
}
