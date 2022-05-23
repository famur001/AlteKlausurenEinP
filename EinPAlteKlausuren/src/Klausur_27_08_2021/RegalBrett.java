package Klausur_27_08_2021;

public class RegalBrett {

	private int breite;
	private double tragkraft;
	
	// AssoziationsAttribute
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
			int summeBreite = 0;
			int summeGewicht = 0;
			for(int i = 0; i < anzahlMedien; i++) {
				summeBreite += medien[i].getBreite();
				summeGewicht += medien[i].getGewicht();
			}
			if( summeBreite+medium.getBreite() <= this.breite
					&& summeGewicht+medium.getGewicht() <= this.tragkraft ) {
				medien[anzahlMedien] = medium;
				anzahlMedien++;
				this.breite -= medium.getBreite();
				this.tragkraft -= medium.getGewicht();
				result = true;
			}
		}
		return result;
	}
	
	public Medium getMedium(int pos) {
		if(pos >= 0 && pos < medien.length) {
			return medien[pos];
		} else {
			return null;
		}
	}
	
	public void removeMedium(int pos) {
		if(pos >=0 && pos < medien.length) {
			medien[pos] = null;
			anzahlMedien--;
		}
	}
	
}
