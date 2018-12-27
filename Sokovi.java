package predavanje4.zad1;

public class Sokovi extends Proizvod{

		private String ukusSoka;
		private static final float PDV_SOKA = 0.2f;

		public Sokovi(String ime, double cena, String rokUpotrebe, String ukusSoka) {
			super(ime, cena, rokUpotrebe);
			this.ukusSoka = ukusSoka;
		}

		public String getUkusSoka() {
			return ukusSoka;
		}

		public void setUkusSoka(String ukusSoka) {
			this.ukusSoka = ukusSoka;
		}

		public static double getPdvSoka() {
			return PDV_SOKA;
		}
		@Override
		public String toString() {
			return "Sok" + super.toString() + "[ukus=" + ukusSoka + "]";
		}
		@Override
		public double cenaSaPDV() {
			return getCena() + (getCena() * PDV_SOKA);
		}

	}
