package predavanje3.zad2;

public enum Zona {
	ZONA1(3000), ZONA2(2000), ZONA3(1000), ZONA4(500);

	private int vrednost;

	Zona(int vrednost) {
		this.setVrednost(vrednost);

	}

	public int getVrednost() {
		return vrednost;
	}

	public void setVrednost(int vrednost) {
		this.vrednost = vrednost;
	}
}
