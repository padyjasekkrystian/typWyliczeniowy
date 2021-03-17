package wycieczka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Klient {
	
	private String imie, nazwisko;
	private List<Wyjazd> wyjazdy = new  ArrayList<>();
	private static List<Klient> ekstensja = new ArrayList<>();

	public Klient(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		ekstensja.add(this);
	}
	
//	public static Map<Klient, Double> ileKlienciwydaliNaWycieczkiZDodatkami(List<Klient> lista) {
//		Map<Klient, Double> mapa = new HashMap<>();
//		double koszt = 0;
//		for (Klient klient : lista) {
//			for (Wyjazd wyjazd : klient.getWyjazdy()) {
//				koszt += wyjazd.kosztDodatkow();
//			}
//			mapa.put(klient, koszt);
//			koszt = 0;
//		}
//		return mapa;
//	}
	public static Klient klientKtoryWydalNajwiecejNaWycieczkiIDodatki(List<Klient> lista) {
		Klient max = lista.get(0);
		if(lista.isEmpty()) {
			throw new IllegalArgumentException("Podales pusta liste klientow");
		}
		for(Klient klient : lista) {
			if(ileKlienciwydaliNaDodatki(lista).get(klient) + klient.kosztWszystkichWycieczekBezDodatkow() 
					> ileKlienciwydaliNaDodatki(lista).get(max) + max.kosztWszystkichWycieczekBezDodatkow()) {
				max = klient;
			}
		}
		return max;	
	}
	
	public static Klient klientKtoryWydalNajwiecejNaDodatki(List<Klient> lista) {
		Klient max = lista.get(0);
		if(lista.isEmpty()) {
			throw new IllegalArgumentException("Podales pusta liste klientow");
		}
		for(Klient klient : lista) {
			if(ileKlienciwydaliNaDodatki(lista).get(klient) > ileKlienciwydaliNaDodatki(lista).get(max)) {
				max = klient;
			}
		}
		return max;	
	}

	public static Map<Klient, Double> ileKlienciwydaliNaDodatki(List<Klient> lista) {
		Map<Klient, Double> mapa = new HashMap<>();
		double koszt = 0;
		if(lista.isEmpty()) {
			throw new IllegalArgumentException("Podales pusta liste klientow");
		}
		for (Klient klient : lista) {
			for (Wyjazd wyjazd : klient.getWyjazdy()) {
				koszt += wyjazd.kosztDodatkow();
			}
			mapa.put(klient, koszt);
			koszt = 0;
		}
		return mapa;
	}
	
	public double kosztWszystkichWycieczekBezDodatkow() {
		double koszt = 0;
		if(wyjazdy.isEmpty()) {
			return koszt;
		}
		for(Wyjazd element : wyjazdy) {
			koszt += element.getWycieczka().getCena();		
			}
		return koszt;
	}
	

	
	public void dodajWyjazd(Wyjazd wyjazd) {
		wyjazdy.add(wyjazd);
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public List<Wyjazd> getWyjazdy() {
		return wyjazdy;
	}
	
	
	public static List<Klient> getEkstensja() {
		return ekstensja;
	}

	public static void setEkstensja(List<Klient> ekstensja) {
		Klient.ekstensja = ekstensja;
	}

	public void setWyjazdy(List<Wyjazd> wyjazdy) {
		this.wyjazdy = wyjazdy;
	}

	public String toString() {
		return imie + " " + nazwisko;
	}
	
	

}
