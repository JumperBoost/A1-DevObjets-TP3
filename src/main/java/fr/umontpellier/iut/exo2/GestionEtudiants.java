package fr.umontpellier.iut.exo2;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {

    static void copier(Etudiant e1, Etudiant e2) {
        e1.remplacer(e2);
    }

    public static void main(String[] args) {
        Etudiant lolo = new Etudiant("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        System.out.println(lolo);

        Etudiant toto = lolo;
        System.out.println("lolo == toto ? " + (lolo == toto)); // Résultat attendu: true
        toto.setNom("Lupin");
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

        Departement monDepInfo = new Departement("Informatique", "99 Avenue d'Occitanie, 34090 Montpellier");
        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(fifi);
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(riri);
        System.out.println(monDepInfo);

        monDepInfo.desinscrire(toto);
        System.out.println(monDepInfo);

        Matiere prog = new Matiere("Programmation", 6);
        Matiere bd = new Matiere("Base de données", 3);
        Matiere maths = new Matiere("Mathématiques", 4);

        lolo.noter(prog, 12);
        lolo.noter(bd, 15);
        lolo.noter(maths, 10.5);

        fifi.noter(prog, 14);
        fifi.noter(bd, 16.75);
        fifi.noter(maths, 8.5);

        riri.noter(prog, 8.75);
        riri.noter(bd, 10.25);
        riri.noter(maths, 12);

        System.out.println(lolo);
        System.out.println(fifi);
        System.out.println(riri);
    }
}
