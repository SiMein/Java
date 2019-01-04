package konten;

public class Zwischenlager {
	
	protected double z;
	protected double l;
	
	
	protected void setPlusZins() {		//  default-konstr -- standardzins
		this.z = 1.00;
	}
	protected void setPlusZins(double z) {  // konstr-mit eingabeparam (ueberladung)
		this.z = z;				
	}
	protected void setMinusZins() {   //  default-konstr -- standardminuszins
		this.z = -5.00;	
	}
	protected void setMinusZins(double z) { // konstr-mit eingabeparam (ueberladung)
		this.z = z;		
	}
	protected void limit() {	// default-konstr -- standardlimit
		this.l = 500.00;
	}
	protected void limit(double l) {	// konstr-mit eingabeparam (ueberladung)
		this.l = l;		
	}
}
