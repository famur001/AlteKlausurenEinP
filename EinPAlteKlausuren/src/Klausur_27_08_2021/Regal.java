package Klausur_27_08_2021;

public class Regal {

	// AssozioationsAttribute
	private RegalBrett[] regalBrett = new ReaglBrett[10]; // 0..9
	private int anzahlRegalBrett;
	
	public Regal( RegalBrett regalBrett1, RegalBrett regalBrett2 ) {
		regalBrett[0] = regalBrett1;
		regalBrett[1] = regalBrett2;
		anzahlRegalBrett = 2;
	}
	
}
