package koszula;

public class Main {

	public static void main(String[] args) {

		Koszula k1 = new Koszula("Zara", "Bialy", Rozmiar.XL);
		
		//name() zwraca nazwe wartosci typu wyliczeniowego
		System.out.println(k1.getRozmiar().name());
		
		//ordinal() zwraca indeks aktualnej wartosci typu wyliczeniowego
		System.out.println(k1.getRozmiar().ordinal());
		
		//valueOf() zwraca wartosc typu wyliczeniowego		
		System.out.println(Rozmiar.valueOf(k1.getRozmiar().name()));
		
		//values() zwraca tablice wartosci enuma
		for(Rozmiar r : Rozmiar.values()) {
			System.out.println(r.name() + " " + r);
		}
		
	}

}
