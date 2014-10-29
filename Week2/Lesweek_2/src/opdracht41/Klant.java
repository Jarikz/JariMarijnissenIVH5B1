package opdracht41;

public class Klant {
	private String naam;
	private int nummer;
	
	public Klant (String naam, int nummer){
		this.naam = naam;
		this.nummer = nummer;
	}
	
	
	/**
	 * @return
	 */
	public String getNaam(){
		return naam;
	}
	
	public int getNummer(){
		return nummer;
	}

}
