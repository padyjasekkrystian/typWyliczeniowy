package metoda.abstrakcyjna;

public enum Przyspieszenie {

	PRZYSPIESZ_SZYBKO {
		String przyspiesz() {
			return "przyspieszasz bardzo szybko wziuuum";
		}
	},

	PRZYSPIESZ_WOLNO {
		String przyspiesz() {
			return "przyspieszasz woolniiutko pyr pyr";
		}

	};

	abstract String przyspiesz();
}
