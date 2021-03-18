package B_J12;

public class Hortensie extends FloareDecorator{

	private final Floare floare;
	
	public Hortensie (Floare floare){
		this.floare=floare;
	}

	public String descriere(){
		return floare.descriere()+", Hortensie (20 lei)";
	}
	
	public double pret(){
		return floare.pret()+20;
	}

}
