package projet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestionFactory {

    private static final ArrayList<Etudiant> listEtudiants = intializeListEtudiants();
    private static final HashMap<Etudiant, Integer> listEtudiantAbsence = intializelistEtudiantAbsence();

    // Initialisation des étudiants
    private static ArrayList<Etudiant> intializeListEtudiants() {

        // Création des étudiants
        Etudiant etu1 = new Etudiant(0, "Brunet-Manquat", "Francis");
        Etudiant etu2 = new Etudiant(1, "Martin", "Philippe");

        ArrayList<Etudiant> listEtudiantsTemp = new ArrayList<Etudiant>();
        listEtudiantsTemp.add(etu1);
        listEtudiantsTemp.add(etu2);

        return listEtudiantsTemp;
    }

    // Initialisation des absences
    private static final HashMap<Etudiant, Integer> intializelistEtudiantAbsence() {

        // Association etudiant -> absences
        HashMap<Etudiant, Integer> listEtudiantAbsenceTemp = new HashMap<Etudiant, Integer>();
        listEtudiantAbsenceTemp.put(listEtudiants.get(0), 0);
        listEtudiantAbsenceTemp.put(listEtudiants.get(1), 7);

        return listEtudiantAbsenceTemp;
    }


    // Donne l'ensemble des etudiants
    public static List<Etudiant> getEtudiants() {
        return listEtudiants;
    }

    public static Etudiant getEtudiantFromId(int id) {
        return listEtudiants.get(id);
    }

    // Donne le nombre d'absences d'un etudiant
    public static Integer getAbsences(Etudiant e) {
        return listEtudiantAbsence.get(e);
    }

}