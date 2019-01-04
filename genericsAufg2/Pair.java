package genericsAufg2;

public class Pair <A, B>{
	A a;
	B b;
	
	public Pair (A a, B b) {  
		this.a = a; 
		this.b = b;
	}
	public A getA() {	
		return a ;
	}
	public B getB() {
		return b ;
	}
	public void setA(A a) {
		this.a = a;		
	}
	public void setB(B b) {
		this.b = b;	
	}
	public String toString() {
		
		return "(" + a.toString() + b.toString() + ")";
	}
	
	public Pair<Character,Integer> getString (String str1) {
		
				// Alternativmethode -hier nicht verwendet !!
				//char[] ar1;	 			  // Methode 1 -String einlesen in ein array,
				//ar1 = str1.toCharArray();	  // dann Vergleich aller Element im array
				// auf maximalVorkommen von einem Element 
		int inmax = 0;					// Dekl/Init der Hilfsvar
		int outermax = 0;
		int mostCharElement = 0;
		
		if ((str1.length() == 0) || (str1 == null)) {
			return null; 
		}
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str1.length(); j++) {
					
				if (str1.charAt(i) == str1.charAt(j)) {  // Methode -ohne extra array- direktes Auslesen
											// mittels Stringmethoden / Iteratoren  i und j / loops 
											// direktes Vergleichen der chars im String
					if (str1.charAt(i) == ' ') {
						break;
					}
					inmax += 1;	
				}
			}
			if (inmax > outermax) {
				outermax = inmax;
				inmax = 0;
				mostCharElement = i; // Position des Max Elements merken
			} else {
				inmax = 0;				
			}			
		}
		System.out.println("Mein String ist : " + str1);
		System.out.println("Das OutMax ist :" + outermax);	
		System.out.println("Das MostElement ist :" + str1.charAt(mostCharElement));
		System.out.println("Es steht an :" + mostCharElement + " Stelle im String (zählt ab 0). "); 
		
	Pair <Character,Integer> pairhilf = new Pair<Character,Integer>(str1.charAt(mostCharElement),mostCharElement);
	
	//pairhilf.setA(str1.charAt(mostCharElement));
	//pairhilf.setB(mostCharElement);	
	
	//System.out.println(pairhilf.getA());
	//System.out.println(pairhilf.getB());
	   	
	return pairhilf;
	}	
}
