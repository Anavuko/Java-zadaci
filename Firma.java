package predavanje4.zad1;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

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
    	this.lista = lista;

    }
    public void stampanjeListaProizvoda () {
    	Iterator<Entry<Proizvod, Integer>> it = lista.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Proizvod, Integer> pair = (Entry<Proizvod, Integer>) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());

		}

    }
	@Override
	public String toString() {
		return String.format("Naziv kompanije: %s Upisani kapital: %.2f dinara", getNazivFirme(), getKapital());
	}

	public void porudzbina(Proizvod proizvod, int kolicina) {

		double cenaPorudzbine = proizvod.cenaSaPDV() * kolicina;

		if (lista.containsKey(proizvod) && lista.get(proizvod) >= kolicina) {

			lista.replace(proizvod, lista.get(proizvod), lista.get(proizvod) - kolicina);
			kapital += cenaPorudzbine;
		} else {

			System.out.println("Nema dovoljno proizvoda na lageru.");
		}
		
	}
	}