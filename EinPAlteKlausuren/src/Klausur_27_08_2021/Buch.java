package Klausur_27_08_2021;

public class Buch implements Medium {

	private int breite;
	private double gewicht;
	
	public Buch(int breite, double gewicht) {
		this.breite = breite;
		this.gewicht = gewicht;
	}
	
	public double getGewicht() {
		return gewicht;
	}
	public int getBreite() {
		return breite;
	}
	
}
