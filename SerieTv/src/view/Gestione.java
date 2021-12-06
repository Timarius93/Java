package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import controller.CtrlSerieTv;

public class Gestione {

	public static void main(String[] args) {
		CtrlSerieTv ctrl = new CtrlSerieTv();

//		ctrl.addSerie("Friends", true);
//		ctrl.addSerie("Lost", true);
//		ctrl.addSerie("GOT", true);
//		ctrl.addSerie("The New Adventures of Mighty Mouse & Heckle and Jeckel.", false);

		Scanner sc;
		try {
			sc = new Scanner(new File("files/elencoSerie.txt"));
			while (sc.hasNextLine()) {
				String s = sc.nextLine(); // memorizzo in una stringa
				//System.out.println(s);
				ctrl.addSerie(s, false);
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.err.println("file non trovato");
		}

		ctrl.stampaLista();

	}

}
