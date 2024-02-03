package fr.umontpellier.iut.exo3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class EtudiantBuilderTest {
    @Test
    public void test_classe_EtudiantBuilder_existe() {
        try {
            Class.forName("fr.umontpellier.iut.exo3.EtudiantBuilder");
        } catch (ClassNotFoundException e) {
            fail("pas de classe nommée EtudiantBuilder dans le paquetage");
        }
    }

    @Test
    public void test_etudiant_build() {
        Etudiant etudiant = new EtudiantBuilder()
                .ajouterNom("Dupont")
                .ajouterPrenom("Philippe")
                .ajouterDateNaissance(LocalDate.of(2003, Month.JANUARY, 28))
                .ajouterMail("dupont@etu.umontpellier.fr")
                .ajouterAdresse("99, Av. Occitanie, 34000 Montpellier")
                .build();
        assertEquals(etudiant.toString(), "L'étudiant Dupont Philippe (dupont@etu.umontpellier.fr) né(e) le 28/01/2003 a comme adresse postale '99, Av. Occitanie, 34000 Montpellier', avec 0 enregistrée(s) et une moyenne de 0.0.");
    }
}
