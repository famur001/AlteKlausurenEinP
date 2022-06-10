package Klausur_10_03_2021_A;

public class ZeichenFinden {
	
	public static void main(String[] args) {
		
		System.out.println(löscheAlleVorkommen("abcax", 'a'));
		
	}

	//							   0123
	//                          w="abbA" => w.length()=4
	//										   c='b'
	public static String löscheErstesVorkommen(String w, char c) {
		String erg = "";
		int zaehler = 0;
		for(int i = 0; i < w.length(); i++) {
			if(w.charAt(i) != c) {
				erg += w.charAt(i);
			} else {
				if(zaehler == 0) {
					zaehler++;
				} else {
					erg += w.charAt(i);
				}
			}
		}
		return erg;
	}
	
	public static String löscheAlleVorkommen(String w, char c) {
		String erg = "";
		for(int i = 0; i < w.length(); i++) {
			if(w.charAt(i) != c) {
				erg += w.charAt(i);
			}
		}
		return erg;
	}
	
}
