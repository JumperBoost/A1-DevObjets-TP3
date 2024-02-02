package fr.umontpellier.iut.exo2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class GestionEtudiantsTest {

    @Test
    public void test_if_main_method_does_not_throw_exceptions() {
        assertDoesNotThrow(() -> GestionEtudiants.main(new String[1]));
    }

    @Test
    public void test_if_copier_method_corresponds_to_the_specifications() {
        Etudiant lolo = new Etudiant("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        Etudiant jojo = new Etudiant("Pytes", "Robert",
                LocalDate.of(2004, Month.AUGUST, 8),
                "robert.pytes@etu.umontpellier.fr", "45 Avenue Carnot, 30100 Alès");
        GestionEtudiants.copier(jojo, lolo);
        assertEquals(jojo.toString(), lolo.toString());
        assertNotEquals(jojo, lolo);
    }
}