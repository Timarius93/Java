package model;

public class SerieTv {

	private String titolo;
	private boolean vista;

	public SerieTv(String titolo, boolean vista) {
		this.titolo = titolo;
		this.vista = vista;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public boolean isVista() {
		return vista;
	}

	public void setVista(boolean vista) {
		this.vista = vista;
	}

	@Override
	public String toString() {
		return "SerieTv [titolo= " + titolo + ", vista= " + vista + "]";
	}

}
