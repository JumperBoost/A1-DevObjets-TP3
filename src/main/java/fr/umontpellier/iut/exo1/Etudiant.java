package fr.umontpellier.iut.exo1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate date_naissance;
    private String adresse_mail;
    private String adresse_postale;

    public Etudiant(String nom, String prenom, LocalDate date_naissance, String adresse_mail, String adresse_postale) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.adresse_mail = adresse_mail;
        this.adresse_postale = adresse_postale;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return "L'étudiant " + this.nom + " " + this.prenom + " (" + this.adresse_mail + ") né(e) le "
                + this.date_naissance.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + " a comme adresse postale '" + this.adresse_postale + "'.";
    }
}
