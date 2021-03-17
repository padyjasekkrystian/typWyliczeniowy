package kalkulator;

public enum Liczenie {
	
	DODAWANIE{
		double licz(double d1, double d2) {
			return d1 + d2;
		}
	},
	
	ODEJMOWANIE{
		double licz(double d1, double d2) {
			return d1 - d2;
		}
	},
	
	MNOZENIE{
		double licz(double d1, double d2) {
			return d1 * d2;
		}
	},
	
	DZIELENIE{
		double licz(double d1, double d2) {
			if(d2 == 0) {
				throw new IllegalArgumentException("Nie dziel przez 0");
			}
			return d1 / d2;
		}
	};
	
	abstract double licz(double d1, double d2);

}
