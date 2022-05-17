package Klausur_27_08_2021;

public class RegalBrett {

	private int breite;
	private double tragkraft;
	
	// AssoziazionsAttribute
	private Medium[] medien = new Medium[100];
	private int anzahlMedien;
	
	public RegalBrett(int breite, double tragkraft) {
		this.breite = breite;
		this.tragkraft = tragkraft;
	}
	
	// AssoziationsMethoden (add, get, remove)
	public boolean addMedium(Medium medium) {
		
		boolean result = false;
		
		if( anzahlMedien < 100 ) {
			
			
			
		}
		
		return result;
		
	}
	
}
