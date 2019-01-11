package Predavanje4Zad2;

import java.util.List;

class Firma {	protected  String fakultet;

	private String nazivFirme;
	private List <Bolnica> listaBolnica;
	
	public Firma() {

	}

	public Firma(String nazivFirme, List <Bolnica> listaBolnica) {
		this.nazivFirme = nazivFirme;
		this.listaBolnica = listaBolnica;

	}

	public Firma(Firma f) {
		nazivFirme = f.nazivFirme;
		listaBolnica = f.listaBolnica;

	}
	public String getNazivFirme() {
		return nazivFirme;
	}

	public void setNazivFirme(String nazivFirme) {
		this.nazivFirme = nazivFirme;
	}

	public List<Bolnica> getListaBolnica(){
		return listaBolnica;
	}
	public void setListaBolnica(List <Bolnica> listaBolnica) {
		this.listaBolnica = listaBolnica;
	}
	public int getBrojBolnica() {
		return listaBolnica.size();
	}
	public String getPodaciOBolnicama() {
		String podaci = "";
		for (Bolnica b: listaBolnica) {
			podaci  = podaci+b + "\n";
		}
		return podaci;
	}

	@Override
	public String toString() {
		return "Naziv Firme:" + getNazivFirme() + " \nBroj bolnica: " + getBrojBolnica() + "\n" + getPodaciOBolnicama() ;
			
	}

}
