package wycieczka;

public enum Dodatek {
	
	ALL_INCLUSIVE(500.0), SAMOCHOD(300.0), ROWER(50.0);
	
	private double cena;

	private Dodatek(double cena) {
		this.cena = cena;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
	
	public String toString() {
		return cena + " ";
	}
	
	

}
