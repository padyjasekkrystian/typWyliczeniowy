package dyplom;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dyplom {
	
	// Stworz klase Dyplom ktora posiada imie i nazwisko, date wystawienia, na
	// dyplomie znajduja sie oceny z przedmiotow(lista klasy Ocena, gdzie ocena ma wartosc i nazwe przedmiotu)
	// stworz kilka dyplomow, znajdz dyplom z najwieksza srednia
	
	private String imie, nazwisko;
	private LocalDate dataWystawienia;
	private List<Ocena> oceny = new ArrayList<>();
	private static List<Dyplom> ekstensja = new ArrayList<>();
	
	public Dyplom(String imie, String nazwisko, LocalDate dataWystawienia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataWystawienia = dataWystawienia;
		ekstensja.add(this);
	}
	
	public static Dyplom najwyzszaSrednia(List<Dyplom> lista) {
		if(lista.isEmpty()) {
			throw new IllegalArgumentException("Lista jest pusta");
		}
		Dyplom max = lista.get(0);
		for(Dyplom element : lista) {
			if(element.liczSrednia() > max.liczSrednia()) {
				max = element;
			}
		}
		return max;
	}
	
	public double liczSrednia() {
		
		if (oceny.isEmpty()) {
			throw new IllegalArgumentException("Tu nie ma zadnych ocen");
		}
		
		double suma = 0;
		for(Ocena element : oceny) {
			suma += element.getOcena().getOcena();
		}
		return suma / oceny.size();
	}
	
	public void dodajOcene(Ocena ocena) {
		oceny.add(ocena);
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

	public LocalDate getDataWystawienia() {
		return dataWystawienia;
	}

	public void setDataWystawienia(LocalDate dataWystawienia) {
		this.dataWystawienia = dataWystawienia;
	}

	public List<Ocena> getOceny() {
		return oceny;
	}

	public void setOceny(List<Ocena> oceny) {
		this.oceny = oceny;
	}

	public static List<Dyplom> getEkstensja() {
		return ekstensja;
	}

	public static void setEkstensja(List<Dyplom> ekstensja) {
		Dyplom.ekstensja = ekstensja;
	}
	
	public String toString() {
		return imie + " " + nazwisko;
	}
	
	
	
	
	

}
