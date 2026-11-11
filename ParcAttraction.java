package examen2014;

public class ParcAttraction {
	public int taille;
	private String nom;
    private Attraction[] lesAttractions;
    private int nb_attraction;
    
    public ParcAttraction(String nom,int taille) {
    	this.nom=nom;
    	this.lesAttractions = new Attraction[taille];
    	this.nb_attraction = 0;
    	this.taille=taille;
    	
    }
    public void ajouterAttraction(Attraction Att) {
    	if (nb_attraction < lesAttractions.length) {
            lesAttractions[nb_attraction] = Att;
            nb_attraction++;
        } else {
            System.out.println("Erreur : Le parc est plein");
        }
    }
    public double getRecette() {
    	double s=0 ;
    	for(int i=0;i<nb_attraction;i++) {
    		s+= lesAttractions[i].getRecette();
    	}
    	return s;
    	
    }
    public void affiche() {
        System.out.println("Parc d'attractions : " + nom );
        for (int i = 0; i < nb_attraction; i++) {
            Attraction a = lesAttractions[i];
            System.out.println("Attraction : " + a.getNom() + " | Recette : " + a.getRecette() + " DT");
        }
    }
}
