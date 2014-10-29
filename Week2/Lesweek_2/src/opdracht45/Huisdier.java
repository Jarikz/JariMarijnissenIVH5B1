package opdracht45;

abstract public class Huisdier {
	private String naam;
	
	public Huisdier(String naam){
		this.naam = naam;
	}
	
	public String getNaam(){
		return naam;
	}
	
	abstract public void maakGeluid();

}
