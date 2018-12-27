package predavanje4.zad1;

public class Meso extends Proizvod{
	
		private String vrstaMesa;
		private static final float PDV_MESA = 0.08f;

		public Meso(String ime, double cena, String rokUpotrebe, String vrstaMesa) {
			super(ime, cena, rokUpotrebe);
			this.vrstaMesa = vrstaMesa;
		}

		public String getVrstaMesa() {
			return vrstaMesa;
		}

		public void setVrstaMesa(String vrstaMesa) {
			this.vrstaMesa = vrstaMesa;
		}

		public static double getPdvMesa() {
			return PDV_MESA;
		}

		@Override
		public String toString() {
			return "Meso" + super.toString() + "[vrstaMesa=" + vrstaMesa + "]";
		}

		@Override
		public double cenaSaPDV() {
			return getCena() + (getCena() * PDV_MESA);
		}


}