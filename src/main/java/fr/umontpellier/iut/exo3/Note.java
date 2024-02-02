package fr.umontpellier.iut.exo3;

public class Note {
    private final Matiere matiere;
    private final double valeur;

    public Note(Matiere matiere, double valeur) {
        this.matiere = matiere;
        this.valeur = valeur;
    }

    public Matiere getMatiere() {
        return this.matiere;
    }

    public double getValeur() {
        return this.valeur;
    }
}
