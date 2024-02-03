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

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDate_naissance() {
        return date_naissance;
    }

    public String getAdresse_mail() {
        return adresse_mail;
    }

    public String getAdresse_postale() {
        return adresse_postale;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void remplacer(Etudiant etudiant) {
        this.nom = etudiant.nom;
        this.prenom = etudiant.prenom;
        this.date_naissance = etudiant.date_naissance;
        this.adresse_mail = etudiant.adresse_mail;
        this.adresse_postale = etudiant.adresse_postale;
    }

    public String toString() {
        return "L'étudiant " + this.nom + " " + this.prenom + " (" + this.adresse_mail + ") né(e) le "
                + this.date_naissance.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + " a comme adresse postale '" + this.adresse_postale + "'.";
    }
}
