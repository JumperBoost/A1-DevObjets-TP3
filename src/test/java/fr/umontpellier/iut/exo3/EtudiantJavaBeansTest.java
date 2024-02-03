package fr.umontpellier.iut.exo3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class EtudiantJavaBeansTest {

    @Test
    public void test_classe_EtudiantJavaBeans_existe() {
        try {
            Class.forName("fr.umontpellier.iut.exo3.EtudiantJavaBeans");
        } catch (ClassNotFoundException e) {
            fail("pas de classe nommée EtudiantJavaBeans dans le paquetage");
        }
    }

    @Test
    public void test_classe_EtudiantJavaBeans_toString() {
        EtudiantJavaBeans lolo = new EtudiantJavaBeans();
        lolo.setNom("Moulin");
        lolo.setPrenom("Loran");
        lolo.setDate_naissance(LocalDate.of(2005, Month.JULY, 17));
        lolo.setAdresse_mail("loran.moulin@etu.umontpellier.fr");
        lolo.setAdresse_postale("12 Rue du Moulin, 11440 Peyriac-de-Mer");
        assertEquals(lolo.toString(), "L'étudiant Moulin Loran (loran.moulin@etu.umontpellier.fr) né(e) le 17/07/2005 a comme adresse postale '12 Rue du Moulin, 11440 Peyriac-de-Mer', avec 0 enregistrée(s) et une moyenne de 0.0.");
    }

    @Test
    public void test_classe_EtudiantJavaBeans_setNom() {
        EtudiantJavaBeans lolo = new EtudiantJavaBeans();
        lolo.setNom("Moulin");
        lolo.setPrenom("Loran");
        lolo.setDate_naissance(LocalDate.of(2005, Month.JULY, 17));
        lolo.setAdresse_mail("loran.moulin@etu.umontpellier.fr");
        lolo.setAdresse_postale("12 Rue du Moulin, 11440 Peyriac-de-Mer");
        EtudiantJavaBeans toto = lolo;
        toto.setNom("Lupin");
        assertEquals(lolo.toString(), "L'étudiant Lupin Loran (loran.moulin@etu.umontpellier.fr) né(e) le 17/07/2005 a comme adresse postale '12 Rue du Moulin, 11440 Peyriac-de-Mer', avec 0 enregistrée(s) et une moyenne de 0.0.");
        assertEquals(lolo, toto);
    }

    @Test
    public void test_calcul_retourne_zero_Quand_Pas_De_Note() {
        EtudiantJavaBeans lolo = new EtudiantJavaBeans();
        lolo.setNom("Moulin");
        lolo.setPrenom("Loran");
        lolo.setDate_naissance(LocalDate.of(2005, Month.JULY, 17));
        lolo.setAdresse_mail("loran.moulin@etu.umontpellier.fr");
        lolo.setAdresse_postale("12 Rue du Moulin, 11440 Peyriac-de-Mer");
        assertEquals(lolo.calculerMoyenne(), 0);
    }

    @Test
    public void test_calcul_moyenne_retourne_valeur_note_quand_une_seule_note_avec_coefficient_de_1() {
        EtudiantJavaBeans lolo = new EtudiantJavaBeans();
        lolo.setNom("Moulin");
        lolo.setPrenom("Loran");
        lolo.setDate_naissance(LocalDate.of(2005, Month.JULY, 17));
        lolo.setAdresse_mail("loran.moulin@etu.umontpellier.fr");
        lolo.setAdresse_postale("12 Rue du Moulin, 11440 Peyriac-de-Mer");
        Matiere math = new Matiere("Mathématiques", 1);
        lolo.noter(math, 16.0f);
        assertEquals(lolo.calculerMoyenne(), 16);
    }

    @Test
    public void test_calcul_moyenne_retourne_valeur_note_quand_une_seule_note_avec_coefficient_autre_que_1() {
        EtudiantJavaBeans lolo = new EtudiantJavaBeans();
        lolo.setNom("Moulin");
        lolo.setPrenom("Loran");
        lolo.setDate_naissance(LocalDate.of(2005, Month.JULY, 17));
        lolo.setAdresse_mail("loran.moulin@etu.umontpellier.fr");
        lolo.setAdresse_postale("12 Rue du Moulin, 11440 Peyriac-de-Mer");
        Matiere math = new Matiere("Mathématiques", 6);
        lolo.noter(math, 15.0f);
        assertEquals(lolo.calculerMoyenne(), 90.0 / 6);
    }

    @Test
    public void test_calcul_moyenne_retourne_moyenne_quand_plusieurs_notes_avec_differents_coefficients() {
        EtudiantJavaBeans lolo = new EtudiantJavaBeans();
        lolo.setNom("Moulin");
        lolo.setPrenom("Loran");
        lolo.setDate_naissance(LocalDate.of(2005, Month.JULY, 17));
        lolo.setAdresse_mail("loran.moulin@etu.umontpellier.fr");
        lolo.setAdresse_postale("12 Rue du Moulin, 11440 Peyriac-de-Mer");
        Matiere math = new Matiere("Mathématiques", 6);
        Matiere eco = new Matiere("Economie", 3);
        Matiere anglais = new Matiere("Anglais", 2);

        lolo.noter(math, 16.0f);
        lolo.noter(eco, 14.0f);
        lolo.noter(anglais, 13.0f);
        assertEquals(lolo.calculerMoyenne(), 164.0f / 11, 10e-3);
    }
}