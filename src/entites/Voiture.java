package entites;

public class Voiture {
	
	
		
		public String marque; 
		public String vitesse; 
		public String puissance;

			
		public Voiture(String marque, String vitesse, String puissance) {
			this.marque = marque; // attribut de la classe, moi
			this.vitesse = vitesse;
			this.puissance = puissance;
			
		
	}
		
		
		public String getMarque() {
			return marque;
		}
		
		public String getVitesse() {
			return vitesse;
		}
		
		public String getPuissance() {
			return puissance;
		}
		
		public void setMarque(String marque) {
			this.marque = marque;
		}
		
		public void setVitesse(String vitesse) {
			this.vitesse = vitesse;
		}
		
		public void setPuissance(String puissance) {
			this.puissance = puissance;
		}
		
		public String toString() {
			
			return "marque => " + this.marque + ", vitesse => " + this.vitesse + ", puissance => " + this.puissance;
			
		}
		
		

}	
