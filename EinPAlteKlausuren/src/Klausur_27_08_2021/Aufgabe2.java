package Klausur_27_08_2021;

public class Aufgabe2 {

	public static void main(String[] args) {

		System.out.println(wiederhole("abc", 5));
		
		System.out.println(brechnePräfix("abcd", 2));
		
		System.out.println(istWiederholt("abcabc"));
		
		System.out.println(istMehrfachWiederholt("abcabcabc"));
		
	}
	
	// i
	public static String wiederhole(String w, int n) {
		String result = "";
		for(int i = 1; i <= n; i++) {
			result += w;
		}
		return result;
	}
	
	// ii
	public static String brechnePräfix(String w, int i) {
		String result = "";
		
		for(int n = 0; n < i; n++) {
			result += w.charAt(n);
		}
		
		return result;
	}
	
	// iii
	public static boolean istWiederholt(String w) {
		
		String teilA = "";
		for( int i = 0;  i < w.length()/2; i++ ) {
			teilA += w.charAt(i);
		}
		
		String teilB = "";
		for(int i = w.length()/2; i < w.length(); i++) {
			teilB += w.charAt(i);
		}
		
		if( teilA.equals(teilB) ) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean istMehrfachWiederholt(String w) {
		
		char anfang = w.charAt(0);
		int counter = 1;
		String teil = w.charAt(0) + "";
		while( anfang != w.charAt(counter) ) {
			teil += w.charAt(counter);
			counter++;
		}
		
		int pos = 0;
		for(int i = counter; i < w.length(); i++) {
			if( w.charAt(i) == teil.charAt(pos) ) {
				pos++;
			} else {
				return false;
			}
			if(pos == counter) {
				pos = 0;
			}
		}
		return true;
	}

}
