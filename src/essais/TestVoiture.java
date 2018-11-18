package essais;

import entites.Voiture;

public class TestVoiture {
	
public static void main(String[] args) {
		
	Voiture Ford = new Voiture("Ford", "300 km/h", "300 kW");
	Voiture Maserati = new Voiture("Maserati", "800 km/h", "800 kW");
	Voiture Ferrari = new Voiture("Ferrari", "850 km/h", "900 kW");

	
		Voiture[] voitures = {Ford, Maserati, Ferrari};
		
		System.out.println("Le nombre de voiture est de " + voitures.length);
		
		for(int i=0; i<voitures.length; i++) {
			
			System.out.println(voitures[i].toString());
		
		}
		
		
		
	}

}
