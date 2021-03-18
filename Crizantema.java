package B_J12;

public class Crizantema extends FloareDecorator {
	
	private final Floare floare; //variabila ce trebuie sa fie accesibila claselor care o extind
	
	public Crizantema(Floare floare){
		this.floare=floare;
	}
	
	public String descriere(){
		return floare.descriere()+ ", Crizantema (8 lei)";
	}
	
	public double pret(){
		return floare.pret() + 8;
	}
}
