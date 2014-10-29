package personen;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Persoon> personenlijst = new ArrayList<Persoon>();
		personenlijst.add( new Persoon("Frank", "Molengraaf") );
		personenlijst.add( new Persoon("Jan", "Molengraaf") );
		personenlijst.add( new Persoon("Gerrit", "Molengraaf") );
		personenlijst.add( new Persoon("Sanne", "Molengraaf") );
		personenlijst.add( new Persoon("Willem", "Molengraaf") );
		
		
		String filenaam = "C:\\Users\\Frank\\Desktop\\object.txt";
		 try {
		   ObjectOutputStream uit =
		     new ObjectOutputStream(
		       new FileOutputStream( filenaam ) );
		   uit.writeObject( personenlijst );
		   uit.close();
		   System.out.println("Het schrijven van het object is gelukt! Open het bestand.");
		 }
		 catch( IOException e ) {
		   System.out.println("Oeps... Er is iets fout gegaan tijdens het maken van het object!");
		 }
 }
	}
