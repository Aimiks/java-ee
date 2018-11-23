package projet;

public class TestAbsences {

    /**
     * @param args
     */
    public static void main(String[] args) {

        for (Etudiant etu : GestionFactory.getEtudiants()) {
            System.out.print(etu.getPrenom() + " " + etu.getNom());
            System.out.println("-> absences : " + GestionFactory.getAbsences(etu));
        }

    }

}
