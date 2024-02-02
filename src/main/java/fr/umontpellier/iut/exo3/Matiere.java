package fr.umontpellier.iut.exo3;

public class Matiere {
    private final String intitule;
    private final int coefficient;

    public Matiere(String intitule, int coefficient) {
        this.intitule = intitule;
        this.coefficient = coefficient;
    }

    public int getCoefficient() {
        return this.coefficient;
    }
}
