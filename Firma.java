package predavanje4.zad1;


import java.util.Map;

class Firma {

    private String nazivFirme;

    private double kapital;

    public Map<Proizvod, Integer> lista;
    
    public Firma () {

    }
    public Firma(String nazivFirme, double kapital) {
    	this.nazivFirme = nazivFirme;
    	this.kapital = kapital;
    }
    public Firma (Firma f) {
    	nazivFirme=f.nazivFirme;
    	kapital=f.kapital;
    }

    public String getNazivFirme() {
    	return nazivFirme;

    }	

    public void setNazivFirme(String nazivFirme) {
    	this.nazivFirme = nazivFirme;
    }

    public double getKapital() {
    	return kapital;

    }
    public void setKapital(double kapital) {
    	this.kapital = kapital;
    }

    public Map<Proizvod, Integer> getLista() {

        return lista;

    }

    public void setLista(Map<Proizvod, Integer> lista) {


    }

    @Override
    public String toString() {
        return String.format("Naziv kompanije: %s Upisani kapital: %.2f dinara",
        		getNazivFirme(), getKapital());
}
	public void porudzbina(Map<Proizvod, Integer> lista2, Proizvod proizvod1, int i) {
	
	}
	}