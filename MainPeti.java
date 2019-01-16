package predavanje5Zad1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainPeti {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
	
		List<Student> listaStudenata = new ArrayList<Student>();
	
		while (true) {
			Student student = new Student();
			System.out.println(" Unesite ime i prezime studenta: ");
			String line = sc.nextLine();
			if (line.equals("Exit")) {
				
			    break;
			   
			}else {
				System.out.println(line);
				student.setIme(line.substring(0, line.indexOf(" ")));
				student.setPrezime(line.substring(line.indexOf(" ")+1));
				
			}
			System.out.println("Unesi broj poena: ");
			line = sc.nextLine();
			if (line.equals("Exit")) {
				
			    break;
			   
			}else {
				try {
					int poeni = Integer.parseInt(line);
					student.setBrojPoena(poeni);
					listaStudenata.add(student);
					
				}catch(Exception e){ 
					System.out.println("Greska nije unet broj " + line);
					
					
				}
				System.out.println(line);
				
			}
		}
		for (Student s:listaStudenata) {
			System.out.println(s);
		}
		Collections.sort(listaStudenata);
		System.out.println("Studenti nakon sortiranja ");
	
		sc.close();
		PrintWriter izlaz;
		try {
			izlaz = new PrintWriter (new FileWriter("ocene.txt"));
			for (Student s:listaStudenata) {
				System.out.println(s);
				izlaz.println(s);
			}	
			izlaz.close();
		}catch (IOException e) {
			
		}
	
		
	}
	
}
