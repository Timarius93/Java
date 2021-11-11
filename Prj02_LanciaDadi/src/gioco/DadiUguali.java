package gioco;

public class DadiUguali {

	public static void main(String[] args) {

		Dado d1 = new Dado();
		Dado d2 = new Dado();
		int contatore = 100;
		int vittorie = 0, sconfitta = 0;

		for (int i = 0; i < contatore; i++) {

			d1.lancia();
			d2.lancia();

			if (d1.valore == d2.valore) {
				System.out.println("gg!");
				vittorie++;
			} else {
				System.out.println("noob");
				sconfitta++;
			}
		}
		
		System.out.println("hai vinto " + vittorie + " volte");
		//trovare un modo per stampare la % di vittorie usando un double
		//giocare a carta sasso forbice

	}

}
