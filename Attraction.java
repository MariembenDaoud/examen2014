package examen2014;

public class Attraction {
    private String nom;
    private double cout;
    private ConditionAge ConditionAge;
    private int nbPersonnes;
    private double recette;

    public Attraction(String nom, double cout, ConditionAge ConditionAge) {
        this.nom = nom;
        this.cout = cout;
        this.ConditionAge = ConditionAge;
        this.nbPersonnes = 0;
        this.recette = 0;
    }
    public double getRecette() {
    	return recette;
    }
    public String getNom() {
    	return nom;
    }

    public void affiche() {
    	System.out.println("le nom : "+nom);
    	System.out.println("le cout : "+cout);
    	System.out.println("le Age Min : "+ConditionAge.getAgeMin());
    	System.out.println("le nbre des personnes : "+nbPersonnes);
    	System.out.println("la recette : "+recette);
    }
    
    public boolean utilise(personne p ) {
    	if(!ConditionAge.accesPossible(p)) {
    		return false;
    		
    	}else {
    		nbPersonnes++;
    		recette+=cout;
    		return true ;
    	}
    }
    	
    
}