package genericsAufg2;

public class Test {

	public static void main(String[] args) {
		Pair <Character,Integer> p1 = new Pair<Character,Integer>('c',0);
		
		Pair <Character,Integer> p2 = new Pair<Character,Integer>('c',0);
		Pair <Character,Integer> p3 = new Pair<Character,Integer>('c',0);
		Pair <Character,Integer> p4 = new Pair<Character,Integer>('c',0);
		
		Pair <Character,Integer> p5 = new Pair<Character,Integer>('c',0);
		Pair <Character,Integer> p6 = new Pair<Character,Integer>('c',0);
		Pair <Character,Integer> p7 = new Pair<Character,Integer>('c',0);
		
		p1.setA('x');
		p1.setB(0);
		
		System.out.println(p1.getA());
		System.out.println(p1.getB());
		
		System.out.println(p1.toString());		
		
		p5 = p2.getString("Many had seen it as clinching proof the whole of known creation had finally gone bananas");
		System.out.println(p5.getA());
		System.out.println(p5.getB());
		System.out.println(p5.toString());
		
		p6 = p3.getString("");
		//System.out.println(p6.getA());		Problem -- NullpointerException --wenn leerer String !!!
		//System.out.println(p6.getB());
		//System.out.println(p6.toString());
		
		p7 = p4.getString("ignorance is bliss");
		System.out.println(p7.getA());
		System.out.println(p7.getB());
		System.out.println(p7.toString());
	}
}	
