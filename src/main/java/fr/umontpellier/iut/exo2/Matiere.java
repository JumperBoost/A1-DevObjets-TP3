package fr.umontpellier.iut.exo2;

public class Matiere {
    private String intitule;
    private int coefficient;

    public Matiere(String intitule, int coefficient) {
        this.intitule = intitule;
        this.coefficient = coefficient;
    }

    public int getCoefficient() {
        return this.coefficient;
    }
}
