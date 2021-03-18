package B_J12;

public class Lalea extends FloareDecorator {
	
	private final Floare floare; //variabila ce trebuie sa fie accesibila claselor care o extind
	
	public Lalea(Floare floare){
		this.floare=floare;
	}
	
	public String descriere(){
		return floare.descriere()+ ", Lalea (7 lei)";
	}
	
	public double pret(){
		return floare.pret() + 7;
	}
}
