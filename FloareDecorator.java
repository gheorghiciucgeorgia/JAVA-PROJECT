package B_J12;

//decoratorul implementeaza interfata Floare, deoarece functionalitatea trebuie crescuta.
public abstract class FloareDecorator implements Floare { //un decorator abstract care va fi extins de celelalte decoratoare concrete 
															//de ex: florile
	public String descriere(){
		return "Flori";
	}
}
