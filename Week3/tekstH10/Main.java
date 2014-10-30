package tekstH10;

import java.io.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<Persoon> personen = new ArrayList<Persoon>();
		
		Persoon persoon1 = new Persoon("Frank", "Homostraat 1", "Pauperbergen");
		Persoon persoon2 = new Persoon("Robin", "Faggotlaan 21", "Pauperdoorn");
		Persoon persoon3 = new Persoon("Tjebbe", "Nichtendijk 53", "Pauperdal");
		
		personen.add(persoon1);
		personen.add(persoon2);
		personen.add(persoon3);
		
		String filenaam = "C:\\Users\\Jari\\Desktop\\text.txt";
		try{
				PrintWriter uit =
				new PrintWriter(
						new BufferedWriter(
								new FileWriter( filenaam ) ) );
				for (Persoon persoon : personen){
				
				uit.println(persoon.getGegevens());}
				
				uit.close();
			
			
		}
		
		catch( IOException e ) {
			System.out.println( "Fout bij openen bestand " + filenaam);
			e.printStackTrace();
		}
		
	}

}
