package com.thomas.serieTv.sl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thomas.serieTv.dal.SerieTvDAO;
import com.thomas.serieTv.entities.SerieTv;

@Service
public class SerieTvServiceImpl implements SerieTvService {

	@Autowired
	private SerieTvDAO repo;
	
	private List<SerieTv> serie;
	
	@Override
	public void addSerie(SerieTv s) {

		this.repo.save(s); //EZ
	}

	@Override
	public SerieTv getSerie(int id) {

		return this.repo.getById(id);
	}

	@Override
	public SerieTv getSerieByName(String titolo) {
		
		return this.repo.findByTitolo(titolo); //gg 
	}
 
		 
	@Override
	public List<SerieTv> getAll() {
		return this.repo.findAll();
	}

	@Override
	public List<SerieTv> getByGenere(String genere) {

		return this.repo.findByGenere(genere); //dovevo salvare lol aahaha xd icsdi rotflmao
	}
	
	@Override
	public void initSerie() {
		if (this.serie == null || this.serie.isEmpty() )
			this.serie = this.getAll();
	}
	
	

}
