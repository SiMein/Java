package konten;

public class Jugendkonten extends Konten{
	
	protected double limit;
	protected double abhebSumme = 0.00;
	
	public Jugendkonten (String kI, int kNr, double kst, double limit) {
		
		super(kI, kNr, kst);
		this.limit = limit;
		
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	public double getLimit() {
		return limit;
	}	
	
	public double getaktuelleabhebSumme() {
		return abhebSumme;	
	}
	@Override
	public void auszahlen(double geld, int tag) {
		if ((1 > tag) || (tag > 30)) {
			System.out.println("ungueltiger Tag");
		}else {
		if(geld > limit) {
			System.out.println("Du kannst nicht mehr als"
								+ limit +" im Monat abheben");
		
		} else if (kontostand - geld <= 0.00) {
			System.out.println("Du hast nicht genug Geld auf dem"
					+ " Konto. Kein Dispo möglich");
		} else if (geld + abhebSumme > limit) {
			System.out.println("Du darfst dein monatl. Limit nicht"
					+ " überschreiten");
		} else {
			abhebSumme += geld;
			kontostand = kontostand - geld;
			System.out.println("neuer Kontostand ist:" + kontostand);
			System.out.println("du hast in diesem Monat abgehoben :" + abhebSumme);
			System.out.println("Es bleiben dir noch für diesen Monat noch : " + (limit-abhebSumme));
		}		// Rundungsfehler weil bei Berechnung double und int !!!  int zunächst in 
		}
	}
}
