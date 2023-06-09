package com.GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GestionePrenotazioni.model.Utente;

@Repository
public interface UtenteDAORepository extends CrudRepository<Utente, Long>{
	public List<Utente> findByUsername(String username);
	public List<Utente> findByUsernameAndLastname(String uername, String lastname);

}
