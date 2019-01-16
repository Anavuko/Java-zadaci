package predavanje5Zad2;


public class StudentZad2  implements Comparable<StudentZad2>{
	private String ime;
	private String prezime;
	private int brojPoena;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getBrojPoena() {
		return brojPoena;
	}

	public void setBrojPoena(int brojPoena) {
		this.brojPoena = brojPoena;
	}
	
	public int ocenaStudenta() {
		if (this.brojPoena > 90) {
			return 10;
		} else if (this.brojPoena >= 81) {
			return 9;
		} else if (this.brojPoena >= 71) {
			return 8;
		} else if (this.brojPoena >= 61) {
			return 7;
		} else if (this.brojPoena >= 51) {
			return 6;
		} else
			return 5;
	}

	@Override 
	public String toString() {
		return String.format ("Ime %s Prezime %s Broj Poena %d Ocena %d " ,getIme(),getPrezime(),getBrojPoena(), ocenaStudenta());
	}

	@Override
	public int compareTo(StudentZad2 s) {
		return s.brojPoena - brojPoena;
	}
}
