package konten;

public class Standardkonten extends Konten{
	protected double dispo;
	
	public Standardkonten (String kI, int kNr, double kontostand,double dispo) {
		super(kI, kNr, kontostand);
		if (dispo > 0) {
			this.dispo = dispo* -1;
		} else { this.dispo = dispo;}	// Schon in Konstr. sicherstellen, dass 
	}									// dispo als negativwert gespeichert wird

	public void setDispo(double dispo) {
		if (dispo > 0) {
			this.dispo = dispo* -1;
		} else { this.dispo = dispo;}
	}
	
	public double getDispo() {
		return dispo;
	}
	
	@Override
	protected void auszahlen(double ausza, int tag) {
		if ((1 > tag) || (tag > 30)) {
			System.out.println("ungueltiger Tag");
		}else {
		if ((kontostand - ausza) < dispo) {
			System.out.println("Sie haben ihren Dispo ueberschritten. keine Auszahlung in der Hoehe möglich.");
		} else {
			kontostand = kontostand - ausza;
			System.out.println("Geld ausgezahlt. Neuer Kontostand ist: " + kontostand);
		}
		}
	}
	
}
