package konten;

public class Zinskonten extends Konten {
	double zinssatz;
	
	public Zinskonten (String kI, int kNr, double kontostand, double zinssatz) {
		super(kI, kNr, kontostand);
		if (zinssatz < 0) {
			this.zinssatz = zinssatz* -1;
		} else { this.zinssatz = zinssatz;} // positiven Zins absichern	
	}
	
	public void setZinssatz(double zinssatz) {
		if (zinssatz < 0) {
			this.zinssatz = zinssatz* -1;
		} else { this.zinssatz = zinssatz;} 
	}	
	public double getZinssatz() {
		return zinssatz;
	}
	// Zinssatzberechnung 
	// Zinsen = kontostand x Zinssatz x (tage/ tage monat gesamt) 
	// BSP.    30,00eur x 1%  x (10/30) 
	//            = 0,30eur / 0,33%  = 0,10eur  zins für 10 tage
	
	public double zinsen(double kontostand,int tage) {
		return kontostand * zinssatz * (tage/30.00/100.00);
	}

}
