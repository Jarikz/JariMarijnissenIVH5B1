package opdracht45;

import java.util.ArrayList;

public class Dierenwinkel {
	
	private ArrayList<Huisdier> lijst;
	
	public Dierenwinkel(ArrayList<Huisdier> lijst){
		this.lijst = lijst;
		
	}
	
	public void voegToe(Huisdier dier){
		lijst.add(dier);
	}
	
	public void printOverzicht(){
		for(Huisdier dier : lijst){
			System.out.println(dier.getNaam());
		}
	}

}
