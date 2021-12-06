package com.thomas.serieTv.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ricordarsi: non fare gli import a mano, gnurant
import com.thomas.serieTv.entities.SerieTv;
import com.thomas.serieTv.sl.SerieTvService;

@RestController
@RequestMapping("api")
public class SerieTvRest {

	@Autowired
	private SerieTvService service;
	
	@GetMapping
	public List<SerieTv> getAll(){
		//inizializzare il contenitore
		this.service.initSerie();
		return this.service.getAll();
	}
	
}
