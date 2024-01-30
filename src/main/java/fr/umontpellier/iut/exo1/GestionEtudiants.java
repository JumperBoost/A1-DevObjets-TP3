package fr.umontpellier.iut.exo1;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {

    static void copier(Etudiant e1, Etudiant e2) {
        e1.setNom(e2.getNom());
        e1.setPrenom(e2.getPrenom());
        e1.setDate_naissance(e2.getDate_naissance());
        e1.setAdresse_mail(e2.getAdresse_mail());
        e1.setAdresse_postale(e2.getAdresse_postale());
    }

    public static void main(String[] args) {
        Etudiant lolo = new Etudiant("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        System.out.println(lolo);

        Etudiant toto = lolo;
        System.out.println("lolo == toto ? " + (lolo == toto)); // Résultat attendu: true
        toto.setNom("Lupin");
        toto.setAdresse_mail("loran.lupin@etu.umontpellier.fr");    // Optionnel
        System.out.println(lolo);
        System.out.println("lolo == toto ? " + (lolo == toto)); // Résultat attendu: true

        Etudiant jojo = new Etudiant("Pytes", "Robert",
                LocalDate.of(2004, Month.AUGUST, 8),
                "robert.pytes@etu.umontpellier.fr", "45 Avenue Carnot, 30100 Alès");
        System.out.println(jojo);

        copier(jojo, toto);
        System.out.println(jojo);
        System.out.println("jojo == toto ? " + (jojo == toto)); // Résultat attendu: false
    }
}
