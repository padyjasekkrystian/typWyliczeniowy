package metoda.abstrakcyjna;

public class Main {

	public static void main(String[] args) {

		Samochod s1 = new Samochod("bmw", "e36");
		
		s1.setPrzyspieszenie(Przyspieszenie.PRZYSPIESZ_SZYBKO);
		
		System.out.println(s1.getPrzyspieszenie().przyspiesz());

	}

}
