package examen2014;

public class main {
    public static void main(String[] args) {
        ParcAttraction parc = new ParcAttraction("Happy Land", 5);

        ConditionAge condAge10 = new ConditionAge(10);
        ConditionAge condAge15 = new ConditionAge(15);

        Attraction montagnesRusses = new Attraction("Montagnes Russes", 5.0, condAge10);
        Attraction maisonHantee = new Attraction("Maison Hantée", 8.0, condAge15);

        parc.ajouterAttraction(montagnesRusses);
        parc.ajouterAttraction(maisonHantee);

        personne p1 = new personne(12, 140, "Ali");
        personne p2 = new personne(8, 120, "Sarra");
        personne p3 = new personne(20, 175, "Mohamed");
        System.out.println("p1 utilise Montagnes Russes : "+ montagnesRusses.utilise(p1));
        System.out.println("p2 utilise Montagnes Russes : "+ montagnesRusses.utilise(p2));
        System.out.println("p3 utilise Maison Hantée : "+ maisonHantee.utilise(p3));
        System.out.println("p1 utilise Maison Hantée : "+ maisonHantee.utilise(p1));
        
        System.out.println("\n---------------Parc ----------------");
        parc.affiche();
        System.out.println("Recette totale du parc : " + parc.getRecette() + " DT");
    }
}