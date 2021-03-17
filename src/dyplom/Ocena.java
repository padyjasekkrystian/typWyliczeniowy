package dyplom;

public class Ocena {
	
	private WartoscOceny ocena;
	private Przedmiot nazwaPrzedmiotu;
	private Dyplom dyplom;
	
	public Ocena(WartoscOceny ocena, Przedmiot nazwaPrzedmiotu, Dyplom dyplom) {
		this.ocena = ocena;
		this.nazwaPrzedmiotu = nazwaPrzedmiotu;
		this.dyplom = dyplom;
		dyplom.dodajOcene(this);
	}

	public WartoscOceny getOcena() {
		return ocena;
	}

	public void setOcena(WartoscOceny ocena) {
		this.ocena = ocena;
	}

	public Przedmiot getNazwaPrzedmiotu() {
		return nazwaPrzedmiotu;
	}

	public void setNazwaPrzedmiotu(Przedmiot nazwaPrzedmiotu) {
		this.nazwaPrzedmiotu = nazwaPrzedmiotu;
	}
	
	public Dyplom getDyplom() {
		return dyplom;
	}

	public void setDyplom(Dyplom dyplom) {
		this.dyplom = dyplom;
	}

	public String toString() {
		return nazwaPrzedmiotu + " " + ocena;
	}
	
	

}
