package wycieczka;

import java.util.ArrayList;
import java.util.List;

public class Wycieczka {
	
	private String nazwa, kraj;
	private double cena;
	private List<Wyjazd> wyjazdy = new ArrayList<>();
	
	public Wycieczka(String nazwa, String kraj, double cena) {
		this.nazwa = nazwa;
		this.kraj = kraj;
		this.cena = cena;
	}
	
	public void dodajWyjazd(Wyjazd wyjazd) {
		wyjazdy.add(wyjazd);
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getKraj() {
		return kraj;
	}

	public void setKraj(String kraj) {
		this.kraj = kraj;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public List<Wyjazd> getWyjazdy() {
		return wyjazdy;
	}
	
	public String toString() {
		return nazwa + " ";
	}
	
	

}
