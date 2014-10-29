package opdracht41;

import java.util.ArrayList;

public class Bestelling {
	
	private ArrayList<Product> bestellijst = new ArrayList<Product>();
	private Klant klant;
	
	public Bestelling(ArrayList<Product> bestellijst, Klant klant){
		this.bestellijst = bestellijst;
		this.klant = klant;
	}
	
	public void print(){
		System.out.println("Naam: " + klant.getNaam());
		System.out.println("Nummer: " + klant.getNummer());
		for(Product prod : bestellijst){
			System.out.println(prod);
		}
		
	}
}
