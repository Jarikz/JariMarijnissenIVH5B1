package opdracht45;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Huisdier> dieren = new ArrayList<Huisdier>();
		Kat kat = new Kat("Harry");
		Hond hond = new Hond("Henk");
		Hamster hamster = new Hamster("Bob");
		
		Dierenwinkel dierenwinkel = new Dierenwinkel(dieren);
		dierenwinkel.voegToe(kat);
		dierenwinkel.voegToe(hond);
		dierenwinkel.voegToe(hamster);
		
		dierenwinkel.printOverzicht();
		
	}

}
