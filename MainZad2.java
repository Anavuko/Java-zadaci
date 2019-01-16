package predavanje5Zad2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainZad2 {

	public static void main(String[] args) {
		Scanner ulaz;

		List<StudentZad2> listaStudenata = new ArrayList<StudentZad2>();
		
		try {
			//skenira red
			ulaz = new Scanner(new FileReader("poeni.txt"));
			while (ulaz.hasNextLine()) {
				StudentZad2 student = new StudentZad2();
				//uzima prvu liniju 
				String line = ulaz.nextLine();
				student.setIme(line.substring(0, line.indexOf(" ")));
				// uzima ime , pocetak 0 jer je pocetak recenice i white space kraj imena 
				line = line.substring(line.indexOf(" ") + 1);
				//uzima sve sto je posle imena tj sto je odseceno od prezimena pa do kraja sa brojem poena
				student.setPrezime(line.substring(0, line.indexOf(" ")));
				//uzima sve posle prezimena
				line = line.substring(line.indexOf(" ") + 1);
				//broj poena pretvara u integer ako je broj dosaje u listu
				int brojPoena = Integer.parseInt(line);
				student.setBrojPoena(brojPoena);
				listaStudenata.add(student);
			}
			//sortira listu studenata
			Collections.sort(listaStudenata);
			for(StudentZad2 s:listaStudenata){
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fajl nije pronadjen");
		} catch (Exception e) {
			System.out.println("Pogresan unos.");
		}

	}

}

