package com.thomas.serieTv.sl;

import java.util.List;

import com.thomas.serieTv.entities.SerieTv;

public interface SerieTvService {

	void addSerie(SerieTv s);
	SerieTv getSerie(int id);
	SerieTv getSerieByName(String titolo);
	List<SerieTv> getAll();
	List<SerieTv> getByGenere(String genere);
	void initSerie();
	
}
