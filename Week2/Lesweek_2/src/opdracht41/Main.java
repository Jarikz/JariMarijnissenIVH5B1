package opdracht41;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> producten = new ArrayList<Product>();
		producten.add(new Product("kaas", 1.49));
		producten.add(new Product("vlees", 2.49));
		
		Klant klant1 = new Klant("peter", 12);
		
		Bestelling bestelling1 = new Bestelling(producten, klant1);
		
		bestelling1.print();
	}

}
