package gioco;

public class Dado {

	public int facce = 6;
	public int valore;

	public void lancia() {
		double casuale = Math.random();
		valore = (int) (casuale * facce) +1;  
		//round � un arrotondamento normale, sotto 0,5 va a 0, sopra 0,5 va a 1
		//floor arrotonda in basso, ceil versol'alto
	}

}
