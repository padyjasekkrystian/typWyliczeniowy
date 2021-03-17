package osoba;

public class Main {

	public static void main(String[] args) {
		/*
		 * Stworz klase Osoba, imie nazwisko, kolor oczu, kolor wlosow, pomysl co moze byc enumem.
		 * Stworz ekstnesje klasy Osoba i napisz metode ktora zwraca liste osobo o kolorze oczu  podanym jako parametr
		 * Napisz metodê która liczy ile jest osób z kolorem wlosow podanym jako parametr
		 * Napisz metodê która zwraca Osobe o najdluzszym nazwisku z oczami podanymi jako parametr
		 */
		
		Osoba o1 = new Osoba("Krystian", "Padyjasek", KolorOczu.ZIELONY, KolorWlosow.BLOND);
		Osoba o2 = new Osoba("Andrzej", "Duda", KolorOczu.BRAZOWY, KolorWlosow.CZARNE);
		Osoba o3 = new Osoba("Marek", "Kowalski", KolorOczu.BRAZOWY, KolorWlosow.BLOND);
		
		System.out.println(Osoba.iloscOsobOKolorzeWlosow(KolorWlosow.BLOND, Osoba.getEkstensja()));
		System.out.println(Osoba.najdluzszeNazwiskoOKolorzeOczu(KolorOczu.BRAZOWY, Osoba.getEkstensja()));
		System.out.println(Osoba.najdluzszeNazwiskoKolorOczu(KolorOczu.BRAZOWY, Osoba.getEkstensja()));
		System.out.println(Osoba.zwrocOsobyPoKolorzeOczu(KolorOczu.BRAZOWY, Osoba.getEkstensja()));

		

	}

}
