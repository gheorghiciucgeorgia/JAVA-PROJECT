package B_J12;

public class Crin extends FloareDecorator {
	
	private final Floare floare;
	
	public Crin (Floare floare){
		this.floare=floare;
	}

	public String descriere(){
		return floare.descriere()+", Crin (10 lei)";
	}
	
	public double pret(){
		return floare.pret()+10;
	}
}
