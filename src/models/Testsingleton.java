package models;

public class Testsingleton {

	public static void main(String[] args) {
		
		 int som = Singleton.getInstance(2,5).somme(2, 5);
		 System.out.printf("la somme est %d ",som);
		 Singleton s1 = Singleton.getInstance(8, 3);
	     s1.affiche();
	     float moyenne=Singleton.getInstance(2,5).moyenne(2,5);
	    		
	    System.out.printf("la moyenne est %f", moyenne);
	    		
		 Singleton s2 = Singleton.getInstance(5, 9);
		 s2.affiche();

	}

}
