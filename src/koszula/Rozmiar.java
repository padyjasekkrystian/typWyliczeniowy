package koszula;

public enum Rozmiar {
	
	S(50,68), M(52,70), L(54,72), XL(56,74);
	
	private int obwodKlatki, dlugoscRekawa;

	private Rozmiar(int obwodKlatki, int dlugoscRekawa) {
		this.obwodKlatki = obwodKlatki;
		this.dlugoscRekawa = dlugoscRekawa;
	}

	public int getObwodKlatki() {
		return obwodKlatki;
	}

	public void setObwodKlatki(int obwodKlatki) {
		this.obwodKlatki = obwodKlatki;
	}

	public int getDlugoscRekawa() {
		return dlugoscRekawa;
	}

	public void setDlugoscRekawa(int dlugoscRekawa) {
		this.dlugoscRekawa = dlugoscRekawa;
	}
	
	public String toString() {
		return obwodKlatki + " " + dlugoscRekawa;
	}
	
	

}
