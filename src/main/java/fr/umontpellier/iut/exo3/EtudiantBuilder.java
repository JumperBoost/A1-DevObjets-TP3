package fr.umontpellier.iut.exo3;

import java.time.LocalDate;

public class EtudiantBuilder {
    private String nom;
    private String prenom;
    private LocalDate date_naissance;
    private String adresse_mail;
    private String adresse_postale;

    public EtudiantBuilder ajouterNom(String nom) {
        this.nom = nom;
        return this;
    }

    public EtudiantBuilder ajouterPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public EtudiantBuilder ajouterDateNaissance(LocalDate date_naissance) {
        this.date_naissance = date_naissance;
        return this;
    }

    public EtudiantBuilder ajouterMail(String adresse_mail) {
        this.adresse_mail = adresse_mail;
        return this;
    }

    public EtudiantBuilder ajouterAdresse(String adresse_postale) {
        this.adresse_postale = adresse_postale;
        return this;
    }

    public Etudiant build() {
        return new Etudiant(nom, prenom, date_naissance, adresse_mail, adresse_postale);
    }
}
