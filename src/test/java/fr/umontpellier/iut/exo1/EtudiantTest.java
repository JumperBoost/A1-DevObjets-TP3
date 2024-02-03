package fr.umontpellier.iut.exo1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

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
    public void test_classe_Etudiant_setNom() {
        Etudiant lolo = new Etudiant("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        Etudiant toto = lolo;
        toto.setNom("Lupin");
        assertEquals(lolo.toString(), "L'étudiant Lupin Loran (loran.moulin@etu.umontpellier.fr) né(e) le 17/07/2005 a comme adresse postale '12 Rue du Moulin, 11440 Peyriac-de-Mer'.");
        assertEquals(lolo, toto);
    }

    @Test
    public void test_classe_Etudiant_remplacer() {
        Etudiant lolo = new Etudiant("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        Etudiant jojo = new Etudiant("Pytes", "Robert",
                LocalDate.of(2004, Month.AUGUST, 8),
                "robert.pytes@etu.umontpellier.fr", "45 Avenue Carnot, 30100 Alès");
        lolo.remplacer(jojo);
        assertEquals(lolo.toString(), "L'étudiant Pytes Robert (robert.pytes@etu.umontpellier.fr) né(e) le 08/08/2004 a comme adresse postale '45 Avenue Carnot, 30100 Alès'.");
        assertNotEquals(lolo, jojo);
    }
}