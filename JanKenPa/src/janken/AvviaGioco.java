package janken;

import java.util.Scanner;

public class AvviaGioco {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int SiNo = 0;
		String cpu;
		String segno = null;

		// le regole appaiono a schermo
		
		do {
			System.out.println("");
			System.out.println("Si gioca a carta forbice sasso contro il computer");
			System.out.println("");
			System.out.println("Scrivi C per scegliere carta");
			System.out.println("Scrivi F per scegliere forbice");
			System.out.println("Scrivi S per scegliere sasso");
			System.out.println("");

			// scelta numero random tra 0,1,2 per la cpu

			int n = (int) (Math.random() * 3);

			// controlli per inserire un segno nella mano della cpu
			// verificando il numero casuale tra 1-2-3
			
			if (n == 0) {
				cpu = "Carta";
			} else {
				if (n == 1) {
					cpu = "Forbice";
				} else {
					cpu = "Sasso";
				}
			}

			System.out.println("");

			// ciclo do/while per far scegliere al gioctore la mossa
			// scelte diverse da C,F,S (le minuscole contano come diverse) fanno ripetere la scelta

			do {
				System.out.println("Fai la tua scelta");
				segno = input.next();

				// switch per stampare cosa ha scelto il giocatore
				// e per sostituire il carattere nella stringa con il segno completo
				
				
				
				
				
				switch (segno) {
				case "C":
					System.out.println("Hai scelto Carta.");
					segno = "Carta";
					break;
				case "F":
					System.out.println("Hai scelto Forbice");
					segno = "Forbice";
					break;
				case "S":
					System.out.println("Hai scelto Sasso");
					segno = "Sasso";
					break;
				default:
					System.out.println("Inserisci una lettara tra C, F, S.");
					System.out.println("");
					segno = "";
					break;
				}
			} while (segno.equals(""));
			
			// inizio controllo delle scelte tra giocatore e cpu
			
			if (segno.equals(cpu)) {
				System.out.println("PAREGGIO!");
			} else {
				if ((segno.equals("Carta") && cpu.equals("Forbice")) || (segno.equals("Forbice") && cpu.equals("Sasso"))
						|| (segno.equals("Sasso") && cpu.equals("Carta"))) {
					System.out.println("Hai perso, sei scarso.");
				} else {
					if (segno.equals("Carta") && cpu.equals("Sasso")) {
						System.out.println("HAI VINTO!!!");
					} else {
						if (segno.equals("Sasso") && cpu.equals("Forbice")) {
							System.out.println("HAI VINTO!!!");
						} else {
							if (segno.equals("Forbice") && cpu.equals("Carta")) {
								System.out.println("HAI VINTO!!!");
							}
						}
					}
				}
			}

			System.out.println("");
			do {
				System.out.println("Vuoi continuare a giocare? 1=si, 2=no");
				SiNo = input.nextInt();
			} while (SiNo != 1 && SiNo != 2);

		} while (SiNo == 1);

		System.out.println("gioco finito.");

	}

}
