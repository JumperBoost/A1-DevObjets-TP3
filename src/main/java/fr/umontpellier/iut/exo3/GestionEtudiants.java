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

        EtudiantJavaBeans riri = new EtudiantJavaBeans();
        riri.setNom("Jotans");
        riri.setPrenom("Richard");
        riri.setDateNaissance(LocalDate.of(2008, Month.FEBRUARY, 26));
        riri.setAdresseMail("richard.jotans@etu.umontpellier.fr");
        riri.setAdressePostale("24 Rue du Languedoc, 11100 Narbonne");
        System.out.println(riri);

        Etudiant phili = new EtudiantBuilder()
                .ajouterNom("Dupont")
                .ajouterPrenom("Philippe")
                .ajouterDateNaissance(LocalDate.of(2003, Month.JANUARY, 28))
                .ajouterMail("dupont@etu.umontpellier.fr")
                .ajouterAdresse("99, Av. Occitanie, 34000 Montpellier")
                .build();
        System.out.println(phili);
    }
}
