package com.GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GestionePrenotazioni.model.Edificio;
import com.GestionePrenotazioni.model.Postazione;
import com.GestionePrenotazioni.model.Tipo_postazione;
@Repository
public interface PostazioneDAORepository extends CrudRepository<Postazione, Long>{

	@Query(value="SELECT u FROM Postazione u WHERE u.edificio.città= :ci and u.tipologia= :ti ")
	public List<Postazione> findByCittàAndTipologia(String ci,Tipo_postazione ti);
}