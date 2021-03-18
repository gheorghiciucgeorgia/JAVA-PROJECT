package B_J12;

//Decorator concret - extinde functionalitatea decoratorului de baza

public class Trandafir extends FloareDecorator {
	
	private final Floare floare; //variabila ce trebuie sa fie accesibila claselor care o extind
	
	public Trandafir(Floare floare){ //am creat un obiect de tip floare
		this.floare=floare; //prin apelarea lui this accesam referinta obiectului Floare care aceasta este implementata de catre Buchete
		//buchetul primeste tipul florii
	}
	
	public String descriere(){
		return floare.descriere()+ ", Trandafir (15 lei)";
	}
	
	public double pret(){
		return floare.pret() + 15;
	}
}
