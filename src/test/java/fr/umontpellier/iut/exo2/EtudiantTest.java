package fr.umontpellier.iut.exo2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class EtudiantTest {

    @Test
    public void test_classe_Etudiant_existe() {
        try {
            Class.forName("fr.umontpellier.iut.exo2.Etudiant");
        } catch (ClassNotFoundException e) {
            fail("pas de classe nommée Etudiant dans le paquetage");
        }
    }

    @Test
    public void test_classe_Etudiant_toString() {
        Etudiant lolo = new Etudiant("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        assertEquals(lolo.toString(), "L'étudiant Moulin Loran (loran.moulin@etu.umontpellier.fr) né(e) le 17/07/2005 a comme adresse postale '12 Rue du Moulin, 11440 Peyriac-de-Mer', avec 0 enregistrée(s) et une moyenne de 0.0.");
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

        assertEquals(jojo.toString(), "L'étudiant Moulin Loran (loran.moulin@etu.umontpellier.fr) né(e) le 17/07/2005 a comme adresse postale '12 Rue du Moulin, 11440 Peyriac-de-Mer', avec 0 enregistrée(s) et une moyenne de 0.0.");
    }

    @Test
    public void test_calcul_retourne_zero_Quand_Pas_De_Note() {
        Etudiant lolo = new Etudiant("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        assertEquals(lolo.calculerMoyenne(), 0);
    }

    @Test
    public void test_calcul_moyenne_retourne_valeur_note_quand_une_seule_note_avec_coefficient_de_1() {
        Etudiant lolo = new Etudiant("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        Matiere math = new Matiere("Mathématiques", 1);
        lolo.noter(math, 16.0f);
        assertEquals(lolo.calculerMoyenne(), 16);
    }

    @Test
    public void test_calcul_moyenne_retourne_valeur_note_quand_une_seule_note_avec_coefficient_autre_que_1() {
        Etudiant lolo = new Etudiant("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        Matiere math = new Matiere("Mathématiques", 6);
        lolo.noter(math, 15.0f);
        assertEquals(lolo.calculerMoyenne(), 90.0 / 6);
    }

    @Test
    public void test_calcul_moyenne_retourne_moyenne_quand_plusieurs_notes_avec_differents_coefficients() {
        Etudiant lolo = new Etudiant("Moulin", "Loran",
                LocalDate.of(2005, Month.JULY, 17),
                "loran.moulin@etu.umontpellier.fr", "12 Rue du Moulin, 11440 Peyriac-de-Mer");
        Matiere math = new Matiere("Mathématiques", 6);
        Matiere eco = new Matiere("Economie", 3);
        Matiere anglais = new Matiere("Anglais", 2);

        lolo.noter(math, 16.0f);
        lolo.noter(eco, 14.0f);
        lolo.noter(anglais, 13.0f);
        assertEquals(lolo.calculerMoyenne(), 164.0f / 11, 10e-3);
    }
}