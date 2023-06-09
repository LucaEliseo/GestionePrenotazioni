package com.GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GestionePrenotazioni.model.Edificio;
import com.GestionePrenotazioni.model.Utente;
@Repository
public interface EdificioDAORepository extends CrudRepository<Edificio, Long>{
	public List<Edificio> findByNome(String username);
	public List<Edificio> findByCittàAndNome(String uername, String lastname);

}