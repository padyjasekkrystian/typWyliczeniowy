package dyplom;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		// Stworz klase Dyplom ktora posiada imie i nazwisko, date wystawienia, na
				// dyplomie znajduja sie oceny z przedmiotow(lista klasy Ocena, gdzie ocena ma wartosc i nazwe przedmiotu)
				// stworz kilka dyplomow, znajdz dyplom z najwieksza srednia
		
		Dyplom d1 = new Dyplom("Krystian", "Padyjasek", LocalDate.of(2008, 5, 20));
		Ocena o1 = new Ocena(WartoscOceny.A, Przedmiot.MATEMATYKA, d1);
		Ocena o2 = new Ocena(WartoscOceny.A, Przedmiot.FIZYKA, d1);
		Ocena o3 = new Ocena(WartoscOceny.A, Przedmiot.INFORMATYKA, d1);
		Ocena o4 = new Ocena(WartoscOceny.A, Przedmiot.CHEMIA, d1);
		Ocena o5 = new Ocena(WartoscOceny.A, Przedmiot.POLSKI, d1);

		Dyplom d2 = new Dyplom("Marek", "Glen", LocalDate.of(2008, 5, 20));
		Ocena o21 = new Ocena(WartoscOceny.B, Przedmiot.MATEMATYKA, d2);
		Ocena o22 = new Ocena(WartoscOceny.C, Przedmiot.FIZYKA, d2);
		Ocena o23 = new Ocena(WartoscOceny.D, Przedmiot.INFORMATYKA, d2);
		Ocena o24 = new Ocena(WartoscOceny.B, Przedmiot.CHEMIA, d2);
		Ocena o25 = new Ocena(WartoscOceny.A, Przedmiot.POLSKI, d2);

		Dyplom d3 = new Dyplom("Maciej", "Grasza", LocalDate.of(2008, 5, 20));
		Ocena o31 = new Ocena(WartoscOceny.F, Przedmiot.MATEMATYKA, d3);
		Ocena o32 = new Ocena(WartoscOceny.E, Przedmiot.FIZYKA, d3);
		Ocena o33 = new Ocena(WartoscOceny.B, Przedmiot.INFORMATYKA, d3);
		Ocena o34 = new Ocena(WartoscOceny.B, Przedmiot.CHEMIA, d3);
		Ocena o35 = new Ocena(WartoscOceny.C, Przedmiot.POLSKI, d3);
		
		System.out.println(d2.liczSrednia());
		System.out.println(Dyplom.najwyzszaSrednia(Dyplom.getEkstensja()));

	}

}
