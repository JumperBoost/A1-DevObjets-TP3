package fr.umontpellier.iut.exo1;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args) {
        Etudiant lolo = new Etudiant("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        System.out.println(lolo);
    }
}
