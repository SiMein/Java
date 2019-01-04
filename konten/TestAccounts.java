package konten;

public class TestAccounts {
	

	public static void main(String[] args) {
		
		Konten konto1 = new Konten("Max,Mueller", 123456, 200.00);  			// abstrakte Klasse
		Standardkonten standardkonto1 = new Standardkonten("Erwin,Ekel", 987654, 500.00, 300.00);
		Jugendkonten jugendkonto1 = new Jugendkonten("Franz,Frosch", 654321, 800.00, 300.00);
		Zinskonten zinskonto1 = new Zinskonten("Hanna,Hase", 456789, 300.00, 1);
		
		
		System.out.println("Der Kontostand betraegt : "+ konto1.getKontostand());
		System.out.println("Der Kontostand betraegt : "+ standardkonto1.getKontostand());
		System.out.println("Der Kontostand betraegt : "+ jugendkonto1.getKontostand());
		System.out.println("Der Kontostand betraegt : "+ zinskonto1.getKontostand());
		System.out.println("");
		
		konto1.einzahlen(250.00, 1);
		konto1.auszahlen(65.50, 10);
		System.out.println("Der Kontostand auf konto1 betraegt : "+ konto1.getKontostand());
		System.out.println("");
		
		standardkonto1.einzahlen(50.00, 2);
		standardkonto1.auszahlen(3040.00, 12);
		System.out.println("Der Kontostand auf standardkonto1 betraegt : "+ standardkonto1.getKontostand());
		System.out.println("Der Dispo ist :" + standardkonto1.getDispo());
		System.out.println("");
		
		jugendkonto1.einzahlen(-10.50, 3);
		jugendkonto1.auszahlen(-20.20, 13);
		System.out.println("Der Kontostand auf jugendkonto1 betraegt : "+ jugendkonto1.getKontostand());
		System.out.println("");
		
		zinskonto1.einzahlen(60.00, 5);
		zinskonto1.auszahlen(80.00, 25);
		System.out.println("Der Kontostand auf zinskonto1 betraegt : "+ zinskonto1.getKontostand());
		System.out.println("");
		System.out.println("Die Zinsen bei manueller Eingabe des Kontostands und der Tage dazu betragen :" + zinskonto1.zinsen(30.00,10));
	}		// Ein und auszahlmethode müssten ggf. kontostaende für jeden tag im monat speicher , evtl in einem array mit 30 feldern
}			// dann könnte mittels der zinsen methode jeder tageszins berechnet werden -dann alle addieren = Monatsgesamtzins
