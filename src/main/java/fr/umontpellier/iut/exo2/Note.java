package fr.umontpellier.iut.exo2;

public class Note {
    private Matiere matiere;
    private float valeur;

    public Note(Matiere matiere, float valeur) {
        this.matiere = matiere;
        this.valeur = valeur;
    }

    public Matiere getMatiere() {
        return this.matiere;
    }

    public float getValeur() {
        return this.valeur;
    }
}
