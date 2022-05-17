package Klausur_27_08_2021;

public class CD implements Medium {

	private int breite;
	
	public CD(int breite) {
		this.breite = breite;
	}
	
	public double getGewicht() {
		return 1.5;
	}
	public int getBreite() {
		return breite;
	}
	
}
