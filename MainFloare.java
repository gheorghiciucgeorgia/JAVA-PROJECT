package B_J12;

//noi trebuie sa decoram obiectul buchet cu flori
//obiectul decorator adauga functionalitatea la decorator dupa ce a fost accesata functia decoratorului.
public class MainFloare {

	public static void main(String[] args) {
		
		//florile pentru buchetele simple
		Floare floare=new BuchetSimplu();
		floare=new Trandafir(floare);
		floare=new Lalea(floare);
		floare=new Crizantema(floare);
		floare= new Crin(floare);
		floare= new Hortensie(floare);
		floare= new Orhidee(floare);
		
		
		//afisare a buchetului simplu
		System.out.println("Descriere: "+floare.descriere());
		System.out.println("Total: "+floare.pret()+" lei");
		
		
		//florile pentru BuchetCriogenate
		Floare floare1=new BuchetCriogenat();
		floare1=new Trandafir(floare1);
		floare1=new Lalea(floare1);
		floare1=new Crizantema(floare1);
		floare1= new Crin(floare1);
		floare1= new Hortensie(floare1);
		floare1= new Orhidee(floare1);
		
		
		//afisare a buchetului Criogenat
		System.out.println("Descriere: "+floare1.descriere());
		System.out.println("Total: "+floare1.pret()+" lei");
		
		// florile pentru buchet cu mesaj
		Floare buchet=new BuchetCuMesaj();
		buchet=new Trandafir(buchet);
		buchet=new Lalea(buchet);
		buchet=new Crizantema(buchet);
		buchet= new Crin(buchet);
		buchet= new Hortensie(buchet);
		buchet= new Orhidee(buchet);
				
		// print
		System.out.println("Descriere: "+buchet.descriere());
		System.out.println("Total: "+buchet.pret());
				
				
		// florile pentru buchet cu mesaj
		Floare aranjament=new Buchet_tip_Aranjament();
		aranjament=new Trandafir(aranjament);
		aranjament=new Lalea(aranjament);
		aranjament=new Crizantema(aranjament);
		aranjament= new Crin(aranjament);
		aranjament= new Hortensie(aranjament);
		aranjament= new Orhidee(aranjament);
				
		// print
		System.out.println("Descriere: "+aranjament.descriere());
		System.out.println("Total: "+aranjament.pret());
	}

}
