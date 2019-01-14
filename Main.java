package Predavanje5Zad2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ulaz;

		List<Student> listaStudenata = new ArrayList<Student>();

		try {
			ulaz = new Scanner(new FileReader("poeni.txt"));
			while (ulaz.hasNextLine()) {
			
				Student student = new Student();
				String line = ulaz.nextLine();
				student.setIme(line.substring(0, line.indexOf(" ")));
				line = line.substring(line.indexOf(" ") + 1);
				student.setPrezime(line.substring(0, line.indexOf(" ")));
				line = line.substring(line.indexOf(" ") + 1);
				int brojPoena = Integer.parseInt(line);
				student.setBrojPoena(brojPoena);
				listaStudenata.add(student);
			}
			Collections.sort(listaStudenata);
			for(Student s:listaStudenata){
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fajl nije pronadjen");
		} catch (Exception e) {
			System.out.println("Pogresan unos.");
		}

	}

}

