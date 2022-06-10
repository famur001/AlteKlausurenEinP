package Klausur_10_03_2021_A;

public class Aufgabe3 {

	double[][] legeFeldAn() {
		double[][] siebenTage = new double[7][];
		return siebenTage;
	}
	
	double[][] fuegeWertHinzu(double[][] feld, int tag, double wert) {
		if( tag < 0 && tag >= 7 && feld.length != 7 ) {
			return null;
		}
		// Falls der Tag noch keine Temperaturwerte enthält
		if( feld[tag] == null  ) {
			feld[tag] = new double[1];
			feld[tag][0] = wert;
		} else {
			
			// kopieren der Elementen in einem neuen Feld
			int lengthOfTag = feld[tag].length;
			double[] kopie = new double[lengthOfTag];
			for( int i = 0; i < lengthOfTag; i++ ) {
				kopie[i] = feld[tag][i];
			}
			// Neues Feld mit einem zusätzlichen Element erstellen
			feld[tag] = new double[lengthOfTag+1];
			// Einfuegen der Elemente von Kopie ins Feld
			for(int i = 0; i < lengthOfTag; i++) {
				feld[tag][i] = kopie[i];
			}
			// wert in das Feld hinzufuegen
			feld[tag][lengthOfTag] = wert;
		}
		return feld;
	}
	
	double berechneDurchschnitt(double[][] feld, int tag) {
		double temperatur = 0.0;
		for(int i = 0; i < feld[tag].length; i++) {
			temperatur += feld[tag][i]; // Summe berechnen
		}
		temperatur /= feld[tag].length; // Durchschnitt
		return temperatur;
	}
	
}
