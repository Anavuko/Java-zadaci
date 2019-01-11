package Predavanje4Zad2;

import java.util.List;

class Bolnica {

	private String nazivBolnice;
	private String direktor;
	private List<Zaposleni> listaZaposlenih;

	public Bolnica() {

	}

	public Bolnica(String NazivBolnice, String Direktor, List<Zaposleni> listaZaposlenih) {
		this.nazivBolnice = NazivBolnice;
		this.direktor = Direktor;
		this.listaZaposlenih = listaZaposlenih;
	}

	public Bolnica(Bolnica b) {
		nazivBolnice = b.nazivBolnice;
		direktor = b.direktor;
		listaZaposlenih = b.listaZaposlenih;

	}

	public List<Zaposleni> getListaZaposlenih() {
		return listaZaposlenih;
	}

	public void setListaZaposlenih(List<Zaposleni> listaZaposlenih) {
		this.listaZaposlenih = listaZaposlenih;
	}

	public String getNazivBolnice() {
		return nazivBolnice;
	}

	public void setNazivBolnice(String nazivBolnice) {
		this.nazivBolnice = nazivBolnice;
	}

	public String getDirektor() {
		return direktor;
	}

	public void setDirektor(String direktor) {
		this.direktor = direktor;
	}

	public int getBrojZaposlenih() {
		return listaZaposlenih.size();
	}

	public int getBrojOsoblja() {
		int brojOsoblja = 0;
		for (Zaposleni z : listaZaposlenih) {
			if (z instanceof Osoblje) {
				brojOsoblja++;
			}

		}
		return brojOsoblja;
	}

	public int getBrojLekara() {
		int brojLekara = 0;
		for (Zaposleni z : listaZaposlenih) {
			if (z instanceof Lekari) {
				brojLekara++;
			}
		}
		return brojLekara;
	}

	public int getBrojMedSestara() {
		int brojMedSestara = 0;
		for (Zaposleni z : listaZaposlenih) {
			if (z instanceof MedSestre) {
				brojMedSestara++;
			}
		}
		return brojMedSestara;
	}

	// vraca podatke o zaposlenima u string objektu
	public String getPodaciOZaposlenima() {
		String podaci = "";
		for (Zaposleni z : listaZaposlenih) {
			podaci = podaci + z + "\n";
		}
		return podaci;
	}

	// ne vraca nista samo ispisuje podatke o objektu
	public void ispisiPodatkeOZaposlenim() {
		for (Zaposleni z : listaZaposlenih) {
			System.out.println(z);
		}
	}

	@Override
	public String toString() {
		return "Naziv bolnice: " + getNazivBolnice() + "\nDirektor: " + getDirektor() + "\nBroj zaposlenih: "
				+ getBrojZaposlenih() + "\nOsoblje: " + getBrojOsoblja() + "\nLekari:" + getBrojLekara()
				+ "\nMedicinske sestre: " + getBrojMedSestara();
	}

}
