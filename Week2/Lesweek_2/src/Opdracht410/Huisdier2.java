package Opdracht410;

public abstract class Huisdier2 implements Huisdier {
	private String naam;
	
	public Huisdier2(String naam){
		this.naam = naam;
	}
	
	public String getNaam(){
		return naam;
	}
	
	abstract public void maakGeluid();

}
