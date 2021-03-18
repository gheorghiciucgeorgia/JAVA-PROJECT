package B_J12;

//mai jos este clasa concreta BuchetSimplu care implementeaza Floare
public class BuchetSimplu implements Floare{
	
	public String descriere(){
		return "Buchet Simplu (5 lei)";
	}
	
	public double pret(){
		return 5;
	}
}
