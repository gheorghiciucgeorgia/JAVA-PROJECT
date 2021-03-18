package B_J12;

public class Orhidee extends FloareDecorator{
	
	private final Floare floare;
	
	public Orhidee (Floare floare){
		this.floare=floare;
	}

	public String descriere(){
		return floare.descriere()+", Orhidee (25 lei)";
	}
	
	public double pret(){
		return floare.pret()+25;
	}

}
