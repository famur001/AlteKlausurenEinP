package Klausur_10_03_2021_A;

//package Aufgabe4;
public class Garten {

	private int laenge;
	private int breite;
	
	private Pflanze[] pflanzen = new Pflanze[100];
	private int anzahlPflanzen = 0;
	
	public Garten(int laenge, int breite, Pflanze pflanze) {
		this.laenge = laenge;
		this.breite = breite;
		
	}
	
	public void addPflanze(Pflanze pflanze) {
		if(anzahlPflanzen < pflanzen.length) {
			pflanzen[anzahlPflanzen] = pflanze;
			anzahlPflanzen++;
		}
	}
	
	public void remove(int pos) {
		if( pos >= 0 && pos < anzahlPflanzen-1
				&& anzahlPflanzen >= 1 ) {
			pflanzen[pos] = pflanzen[anzahlPflanzen-1];
			pflanzen[anzahlPflanzen-1] = null;
			anzahlPflanzen--;
		}
	}
	
	public Pflanze getPflanze(int pos) {
		if( pos >= 0 && pos < anzahlPflanzen-1 ) {
			return pflanzen[pos];
		} else {
			return null;
		}
	}
	
	public boolean testeFlaeche() {
		int flaeche = 0;
		for(int i = 0; i < anzahlPflanzen; i++) {
			flaeche += pflanzen[i].getFlaeche();
		}
		if(flaeche <= laenge*breite) {
			return true;
		} else {
			return false;
		}
	}
	
}
