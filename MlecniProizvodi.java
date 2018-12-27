package predavanje4.zad1;

public class MlecniProizvodi extends Proizvod{

		private String poreklo;
		private static final float PDV_MLEKA = 0.2f;

		public MlecniProizvodi(String ime, double cena, String rokTrajanja, String poreklo) {
			super(ime, cena, rokTrajanja);
			this.poreklo = poreklo;
		}

		public static double getPdvMleka() {
			return PDV_MLEKA;
		}

		public String getPoreklo() {
			return poreklo;
		}

		public void setPoreklo(String poreklo) {
			this.poreklo = poreklo;
		}

		@Override
		public String toString() {
			return "Mlecni Proizvod" + super.toString() + "[poreklo=" + poreklo + "]";
		}

		@Override
		public double cenaSaPDV() {
			return getCena() + (getCena() * PDV_MLEKA);
		}

	}

