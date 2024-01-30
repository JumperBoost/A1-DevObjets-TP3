package fr.umontpellier.iut.exo1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class EtudiantTest {

    @Test
    public void test_classe_Etudiant_existe() {
        try {
            Class.forName("fr.umontpellier.iut.exo1.Etudiant");
        } catch (ClassNotFoundException e) {
            fail("pas de classe nommée Etudiant dans le paquetage");
        }
    }

    @Test
    public void test_classe_Etudiant_toString() {
        Etudiant lolo = new Etudiant("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        assertEquals(lolo.toString(), "L'étudiant Moulin Loran (loran.moulin@etu.umontpellier.fr) né(e) le 17/07/2005 a comme adresse postale '12 Rue du Moulin, 11440 Peyriac-de-Mer'.");
    }

    @Test
    public void test_classe_Etudiant_setters_getters() {
        Etudiant lolo = new Etudiant("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        Etudiant jojo = new Etudiant("Pytes", "Robert",
                LocalDate.of(2004, Month.AUGUST, 8),
                "robert.pytes@etu.umontpellier.fr", "45 Avenue Carnot, 30100 Alès");

        jojo.setNom(lolo.getNom());
        jojo.setPrenom(lolo.getPrenom());
        jojo.setDate_naissance(lolo.getDate_naissance());
        jojo.setAdresse_mail(lolo.getAdresse_mail());
        jojo.setAdresse_postale(lolo.getAdresse_postale());

        assertEquals(jojo.toString(), "L'étudiant Moulin Loran (loran.moulin@etu.umontpellier.fr) né(e) le 17/07/2005 a comme adresse postale '12 Rue du Moulin, 11440 Peyriac-de-Mer'.");
    }
}