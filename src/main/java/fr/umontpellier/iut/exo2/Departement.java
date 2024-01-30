package fr.umontpellier.iut.exo2;

import java.util.ArrayList;

public class Departement {
    private final String specialite;
    private final String adresse;
    private final ArrayList<Etudiant> etudiants = new ArrayList<>();

    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
    }

    public String toString() {
        return "Le département " + this.specialite + " est situé au '" + this.adresse + "', avec " + this.etudiants.size() + " étudiants.";
    }

    public void inscrire(Etudiant etudiant) {
        this.etudiants.add(etudiant);
    }

    public void desinscrire(Etudiant etudiant) {
        this.etudiants.remove(etudiant);
    }
}
