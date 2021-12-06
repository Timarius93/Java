package controller;

import java.util.ArrayList;

import model.SerieTv;

public class CtrlSerieTv {
	
	private ArrayList<SerieTv> lista = new ArrayList<>();
	
	public CtrlSerieTv() {
		this.lista = new ArrayList<SerieTv>();
	}
	
	public void addSerie(String titolo, boolean vista) {
		this.lista.add(new SerieTv(titolo, vista));
		
	}
	
	public void stampaLista() {
		for (SerieTv serieTv : lista) {
			System.out.println(serieTv.toString());
			
		}
	}
	
	
}
