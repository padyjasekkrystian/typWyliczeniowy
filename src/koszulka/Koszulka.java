package koszulka;

public class Koszulka {
	
	private String producent, kolor;
	private Rozmiar rozmiar;

	public Koszulka(String producent, String kolor, Rozmiar rozmiar) {
		this.producent = producent;
		this.kolor = kolor;
		this.rozmiar = rozmiar;
	}

	public String getProducent() {
		return producent;
	}

	public void setProducent(String producent) {
		this.producent = producent;
	}

	public String getKolor() {
		return kolor;
	}

	public void setKolor(String kolor) {
		this.kolor = kolor;
	}

	public Rozmiar getRozmiar() {
		return rozmiar;
	}

	public void setRozmiar(Rozmiar rozmiar) {
		this.rozmiar = rozmiar;
	}

	public String toString() {
		return producent + " " + kolor + " " + rozmiar;
	}
	
	

}
