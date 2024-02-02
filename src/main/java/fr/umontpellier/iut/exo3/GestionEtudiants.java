package fr.umontpellier.iut.exo3;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args) {
        EtudiantTelescopique lolo = new EtudiantTelescopique("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        System.out.println(lolo);

        EtudiantTelescopique jojo = new EtudiantTelescopique("Pytes", "Robert",
                LocalDate.of(2004, Month.AUGUST, 8));
        System.out.println(jojo);
    }
}
