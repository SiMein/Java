package konten;

public class Konten {
	protected String kontoinhaber;
	protected int kontonummer;
	protected double kontostand;
	
	protected Konten(String kI, int kNr, double kSt) {
		this.kontoinhaber = kI;
		this.kontonummer = kNr;
		this.kontostand = kSt;		
	}
	
	public double getKontostand() {
		return kontostand;
	}
	public String getKontoinhaber() {
		return kontoinhaber;
	}
	public double getKontonummer() {
		return kontonummer;
	}
	
	protected void einzahlen(double einza, int Tag) {
		if ((0 < Tag) && (Tag < 31)) {
			if (einza > 0.00) {
				kontostand = kontostand + einza;
					// hier Wert irgendwo zwischenspeichern für Zinsberechnung am ende des monats ??
				System.out.println("Geld eingezahlt. Neuer Kontostand ist: " + kontostand);
			} else {
				System.out.println("Bitte geben Sie einen positiven Wert der Einzahlsumme ein");
			}
		}
	}
	protected void auszahlen(double ausza, int tag) {
		if ((0 < tag) && (tag < 31)) {
			if (ausza > 0.00) {
				kontostand = kontostand - ausza;
					// hier Wert irgendwo zwischenspeichern für Zinsberechnung am ende des monats ??
				System.out.println("Geld ausgezahlt. Neuer Kontostand ist: " + kontostand);
			} else {
				System.out.println("Bitte geben Sie einen positiven Wert der Auszahlsumme ein");
			}
		}
	}		
}
