package com.GestionePrenotazioni.runner;


	import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.ApplicationArguments;
	import org.springframework.boot.ApplicationRunner;
	import org.springframework.stereotype.Component;

import com.GestionePrenotazioni.model.Postazione;
import com.GestionePrenotazioni.model.Prenotazione;
import com.GestionePrenotazioni.model.Tipo_postazione;
import com.GestionePrenotazioni.repository.PostazioneDAORepository;
import com.GestionePrenotazioni.repository.PrenotazioneDAORepository;
import com.GestionePrenotazioni.service.EdificioService;
import com.GestionePrenotazioni.service.PostazioneService;
import com.GestionePrenotazioni.service.PrenotazioneService;
import com.GestionePrenotazioni.service.UtenteService;




	@Component
public class Runner implements ApplicationRunner{

	
		@Autowired EdificioService edificioService;
			@Autowired UtenteService utenteService;
			@Autowired PostazioneService postazioneService;
			@Autowired PrenotazioneService prenotazioneService;
            @Autowired PostazioneDAORepository postazioneDAORepository;
            @Autowired PrenotazioneDAORepository prenotazioneDAORepository;
		@Override
		public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run..");
		
		
		utenteService.createFakeUtente();
		utenteService.createFakeUtente();

		edificioService.createFakeEdificio();
		prenotazioneService.createPrenotazione(utenteService.findUtenteById(1l), postazioneService.findPostazioneById(2l), LocalDate.now().plusDays(2));

		List<Postazione>p=postazioneDAORepository.findByCittàAndTipologia("Napoli",Tipo_postazione.PRIVATO);
		
		}

	}

