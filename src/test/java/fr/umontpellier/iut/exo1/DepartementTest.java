package fr.umontpellier.iut.exo1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class DepartementTest {
    @Test
    public void test_classe_Departement_existe() {
        try {
            Class.forName("fr.umontpellier.iut.exo1.Departement");
        } catch (ClassNotFoundException e) {
            fail("pas de classe nommée Departement dans le paquetage");
        }
    }

    @Test
    public void test_classe_Departement_toString() {
        Departement info = new Departement("Informatique", "Place Eugène Bataillon, 34095 Montpellier");
        Etudiant lolo = new Etudiant("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        info.inscrire(lolo);
        assertEquals(info.toString(), "Le département Informatique est situé au 'Place Eugène Bataillon, 34095 Montpellier', avec 1 étudiant(s).");
    }
}
