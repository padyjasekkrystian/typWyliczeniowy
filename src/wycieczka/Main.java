package wycieczka;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		/*
		 * Stwórz klase klient wycieczka, klient moze miec wiele wycieczek, wycieczka
		 * moze miec wielu klientow. Wycieczka ma nazwe, kraj, cena i liste dodatkow
		 * (kazdy jest dodatkowo platny) Znadz klienta który wydal najwiecej na dodatki
		 * do wycieczki uwzgledniajac tez cene wycieczki Znadz klienta który wydal
		 * najwiecej na dodatki do wycieczki nieuwzgledniajac tez ceny wycieczki
		 */
		
		Klient k1 = new Klient("Krystian", "Padyjasek");
		Klient k2 = new Klient("Piotr", "Rodzik");
		Klient k3 = new Klient("Damian", "Momot");
		
		Wycieczka w1 = new Wycieczka("biedna", "Polska", 500);
		Wycieczka w2 = new Wycieczka("bogata", "USA", 50000);
		Wycieczka w3 = new Wycieczka("srednia", "Turcja", 5000);
		Wycieczka w4 = new Wycieczka("probna", "Radom", 30);

		
		Wyjazd wyj1 = new Wyjazd(LocalDate.of(2021, 7, 31), k1, w2);
		wyj1.dodajDodatki(Dodatek.ALL_INCLUSIVE);
		wyj1.dodajDodatki(Dodatek.SAMOCHOD);
		Wyjazd wyj2 = new Wyjazd(LocalDate.of(2020, 3, 3), k1, w1);
		wyj2.dodajDodatki(Dodatek.ALL_INCLUSIVE);
		Wyjazd wyj3 = new Wyjazd(LocalDate.of(2020, 5, 3), k2, w3);
		Wyjazd wyj4 = new Wyjazd(LocalDate.of(2020, 5, 3), k2, w2);
		wyj4.dodajDodatki(Dodatek.ALL_INCLUSIVE);

		
		
		System.out.println(wyj1.kosztDodatkow());
		System.out.println(k1.kosztWszystkichWycieczekBezDodatkow());
		System.out.println(Klient.ileKlienciwydaliNaDodatki(Klient.getEkstensja()));
		System.out.println(Klient.klientKtoryWydalNajwiecejNaDodatki(Klient.getEkstensja()));
		System.out.println(Klient.klientKtoryWydalNajwiecejNaWycieczkiIDodatki(Klient.getEkstensja()));

		

	}

}
