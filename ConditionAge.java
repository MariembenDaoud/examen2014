package examen2014;

public class ConditionAge implements ConditionAcces {
	private int AgeMin;
	public ConditionAge(int AgeMin) {
		this.AgeMin=AgeMin;
	}
	public int getAgeMin() {
		return AgeMin;
	}
	public boolean accesPossible(personne p) {
        return p.getAge() > AgeMin;
    }
	

}
