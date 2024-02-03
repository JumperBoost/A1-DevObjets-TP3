package fr.umontpellier.iut.exo3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class EtudiantJavaBeans {
    private String nom;
    private String prenom;
    private LocalDate date_naissance;
    private String adresse_mail;
    private String adresse_postale;
    private final ArrayList<Note> notes = new ArrayList<>();

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

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDate_naissance(LocalDate date_naissance) {
        this.date_naissance = date_naissance;
    }

    public void setAdresse_mail(String adresse_mail) {
        this.adresse_mail = adresse_mail;
    }

    public void setAdresse_postale(String adresse_postale) {
        this.adresse_postale = adresse_postale;
    }

    public void noter(Matiere matiere, double valeur) {
        this.notes.add(new Note(matiere, valeur));
    }

    public double calculerMoyenne() {
        double somme = 0;
        int coefficient = 0;
        for (Note note : this.notes) {
            somme += note.getValeur() * note.getMatiere().getCoefficient();
            coefficient += note.getMatiere().getCoefficient();
        }
        return coefficient != 0 ? somme / coefficient : 0;
    }

    public String toString() {
        return "L'étudiant " + this.nom + " " + this.prenom + " (" + this.adresse_mail + ") né(e) le "
                + this.date_naissance.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + " a comme adresse postale '" + this.adresse_postale + "', avec " + this.notes.size() + " enregistrée(s) et une moyenne de " + calculerMoyenne() + ".";
    }
}