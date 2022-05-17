package Klausur_27_08_2021;

public class Aufgabe3 {

	public static void main(String[] args) {

		int[][] feld = { 
				{1,5,9},
				{7,3,10},
				{20,10,5}	
		};
		
		System.out.println(max(feld));
		
	}
	
	public static int max(int[][] feld) {
		
		int max = 0;
		for(int i = 0; i < feld.length; i++) {
			for(int j = 0; j < feld[i].length; j++) {
				if(feld[i][j] > max)
					max = feld[i][j];
			}
		}
		return max;
		
	}
	
	public static int[] berechneHäufigkeiten(int[][] feld) {
		int max = max(feld);
		int[] result = new int[max+1];
		
		for(int i = 0; i < feld.length; i++) {
			for(int j = 0; j < feld[i].length; j++) {
				result[ feld[i][j] ] ++;
			}
		}
		
		return result;
	}

}
