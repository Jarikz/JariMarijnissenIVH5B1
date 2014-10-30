package tekstH10;

public class Persoon {
	
	private String naam;
	private String adres;
	private String woonplaats;
	private String gegevens;
	
	public Persoon(String naam, String adres, String woonplaats){
		this.naam = naam;
		this.adres = adres;
		this.woonplaats = woonplaats;
	}
	
	public String getGegevens(){
		gegevens = naam + " " + adres + " " + woonplaats;
		return gegevens;
	}

}
