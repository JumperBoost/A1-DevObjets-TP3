package fr.umontpellier.iut.exo2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class DepartementTest {
    @Test
    public void test_classe_Departement_existe() {
        try {
            Class.forName("fr.umontpellier.iut.exo2.Departement");
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

    @Test
    public void test_classe_Departement_moyenne_promo() {
        Departement info = new Departement("Informatique", "Place Eugène Bataillon, 34095 Montpellier");
        Etudiant lolo = new Etudiant("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        Etudiant jojo = new Etudiant("Pytes", "Robert",
                LocalDate.of(2004, Month.AUGUST, 8),
                "robert.pytes@etu.umontpellier.fr", "45 Avenue Carnot, 30100 Alès");
        Etudiant fifi = new Etudiant("Jotans", "Filien",
                LocalDate.of(2004, Month.JUNE, 16),
                "filien.jotans@etu.umontpellier.fr", "24 Rue du Languedoc, 11100 Narbonne");

        info.inscrire(lolo);
        info.inscrire(jojo);
        info.inscrire(fifi);

        Matiere prog = new Matiere("Programmation", 6);
        Matiere bd = new Matiere("Base de données", 3);
        Matiere maths = new Matiere("Mathématiques", 4);

        lolo.noter(prog, 16);
        lolo.noter(bd, 15);
        lolo.noter(maths, 10);

        jojo.noter(prog, 14);
        jojo.noter(bd, 16);
        jojo.noter(maths, 8);

        fifi.noter(prog, 8);
        fifi.noter(bd, 10);
        fifi.noter(maths, 12);

        System.out.println(info.getMoyennePromo());
        assertEquals(info.getMoyennePromo(), 157.0/13, 1e-3);
    }
}
