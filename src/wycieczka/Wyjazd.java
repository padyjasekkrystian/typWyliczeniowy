package wycieczka;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Wyjazd {
	
	private LocalDate dataWyjazdu;
	private Klient klient;
	private Wycieczka wycieczka;
	private List<Dodatek> dodatki = new ArrayList<>();
	private static List<Wyjazd> ekstensja = new ArrayList<>();
	
	public Wyjazd(LocalDate dataWyjazdu, Klient klient, Wycieczka wycieczka) {
		this.dataWyjazdu = dataWyjazdu;
		this.klient = klient;
		this.wycieczka = wycieczka;
		klient.dodajWyjazd(this);
		wycieczka.dodajWyjazd(this);
		ekstensja.add(this);
	}
	
	public double kosztDodatkow() {
		double koszt = 0;
		if(dodatki.isEmpty()) {
			return koszt;
		}else {
			for(Dodatek element : dodatki) {
				koszt += element.getCena();
			}
			return koszt;
		}
	}
	
	public void dodajDodatki(Dodatek element) {
		dodatki.add(element);
	}

	public static List<Wyjazd> getEkstensja() {
		return ekstensja;
	}

	public LocalDate getDataWyjazdu() {
		return dataWyjazdu;
	}

	public void setDataWyjazdu(LocalDate dataWyjazdu) {
		this.dataWyjazdu = dataWyjazdu;
	}

	public Klient getKlient() {
		return klient;
	}

	public void setKlient(Klient klient) {
		this.klient = klient;
	}

	public Wycieczka getWycieczka() {
		return wycieczka;
	}

	public void setWycieczka(Wycieczka wycieczka) {
		this.wycieczka = wycieczka;
	}

	public List<Dodatek> getDodatki() {
		return dodatki;
	}

	public void setDodatek(List<Dodatek> dodatki) {
		this.dodatki = dodatki;
	}
	
	
	
	

}
