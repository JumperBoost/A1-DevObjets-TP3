package fr.umontpellier.iut.exo2;

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


        Etudiant fifi = new Etudiant("Jotans", "Filien",
                LocalDate.of(2004, Month.JUNE, 16),
                "filien.jotans@etu.umontpellier.fr", "24 Rue du Languedoc, 11100 Narbonne");
        Etudiant riri = new Etudiant("Jotans", "Richard",
                LocalDate.of(2008, Month.FEBRUARY, 26),
                "richard.jotans@etu.umontpellier.fr", "24 Rue du Languedoc, 11100 Narbonne");
        System.out.println(fifi);
        System.out.println(riri);

        Departement info = new Departement("Informatique", "99 Avenue d'Occitanie, 34090 Montpellier");
        info.inscrire(lolo);
        info.inscrire(fifi);
        info.inscrire(toto);
        info.inscrire(riri);
        System.out.println(info);

        info.desinscrire(toto);
        System.out.println(info);

        Matiere prog = new Matiere("Programmation", 6);
        Matiere bd = new Matiere("Base de données", 3);
        Matiere maths = new Matiere("Mathématiques", 4);

        lolo.noter(prog, 12.0f);
        lolo.noter(bd, 15.0f);
        lolo.noter(maths, 10.0f);

        fifi.noter(prog, 14.0f);
        fifi.noter(bd, 16.0f);
        fifi.noter(maths, 8.0f);

        riri.noter(prog, 8.0f);
        riri.noter(bd, 10.0f);
        riri.noter(maths, 12.0f);

        System.out.println(lolo);
        System.out.println(fifi);
        System.out.println(riri);
    }
}
