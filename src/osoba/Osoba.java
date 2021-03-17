package osoba;

import java.util.*;

public class Osoba {
	
	private String imie, nazwisko;
	private KolorOczu oczy;
	private KolorWlosow wlosy;
	public static List<Osoba> ekstensja = new ArrayList<>();
	
	public Osoba(String imie, String nazwisko, KolorOczu oczy, KolorWlosow wlosy) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.oczy = oczy;
		this.wlosy = wlosy;
		ekstensja.add(this);
	}
// * Stworz ekstnesje klasy Osoba i napisz metode ktora zwraca liste osobo o kolorze oczu  podanym jako parametr	
	public static List<Osoba> zwrocOsobyPoKolorzeOczu(KolorOczu oczy, List<Osoba> lista){
		List<Osoba> kolorOczu = new ArrayList<>();
		for(Osoba o : lista) {
			if(o.getOczy() == oczy) {
				kolorOczu.add(o);
			}
		}
		return kolorOczu;
	}
	
// * Napisz metodê która liczy ile jest osób z kolorem wlosow podanym jako parametr
	public static int iloscOsobOKolorzeWlosow(KolorWlosow wlosy, List<Osoba> lista) {
		int licznik = 0;
		for(Osoba o : lista) {
			if(o.getWlosy() == wlosy) {
				licznik++;
			}
		}
		return licznik;
	}
	
	public static Osoba najdluzszeNazwiskoKolorOczu(KolorOczu oczy, List<Osoba> lista) {
		Osoba najdluzszeNazwisko = lista.get(0);// brazowe nazwisko 10 liter
		for (Osoba o : lista) {
			// niebieskie 3 litery
			if ((najdluzszeNazwisko.getOczy() != oczy && o.getOczy() == oczy)
			|| (o.getOczy() == oczy && najdluzszeNazwisko.getNazwisko().length() < o.getNazwisko().length())) {
				najdluzszeNazwisko = o;
			}
		}
		return najdluzszeNazwisko;
	}
	
// * Napisz metodê która zwraca Osobe o najdluzszym nazwisku z oczami podanymi jako parametr
	public static Osoba najdluzszeNazwiskoOKolorzeOczu(KolorOczu oczy, List<Osoba> lista) {
		List<Osoba> osobyZOczami = zwrocOsobyPoKolorzeOczu(oczy, lista);
		if(osobyZOczami.size() == 0) {
			throw new IllegalArgumentException("Nie ma nikogo na tej liscie");
		}
		
		Osoba najdluzszeNazwisko = osobyZOczami.get(0);
		
		for(Osoba o : osobyZOczami) {
			if(o.getNazwisko().length() > najdluzszeNazwisko.getNazwisko().length()) {
				najdluzszeNazwisko = o;
			}
		}
		return najdluzszeNazwisko;
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

	public KolorOczu getOczy() {
		return oczy;
	}

	public void setOczy(KolorOczu oczy) {
		this.oczy = oczy;
	}

	public KolorWlosow getWlosy() {
		return wlosy;
	}

	public void setWlosy(KolorWlosow wlosy) {
		this.wlosy = wlosy;
	}

	public static List<Osoba> getEkstensja() {
		return ekstensja;
	}

	public static void setEkstensja(List<Osoba> ekstensja) {
		Osoba.ekstensja = ekstensja;
	}
	
	public String toString() {
		return imie + " " + nazwisko;
	}
	
	
	
	
	

}
