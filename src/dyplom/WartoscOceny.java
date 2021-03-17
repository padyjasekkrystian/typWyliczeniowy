package dyplom;

public enum WartoscOceny {
	
	A(5.0), B(4.5), C(4.0), D(3.5), E(3.0), F(2.0);
	
	private double ocena;

	private WartoscOceny(double ocena) {
		this.ocena = ocena;
	}

	public double getOcena() {
		return ocena;
	}

	public void setOcena(double ocena) {
		this.ocena = ocena;
	}
	
	public String toString() {
		return ocena + " ";
	}

}
