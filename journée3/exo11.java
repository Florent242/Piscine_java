import java.util.Scanner;

public class exo11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Combien de nombres à entrer ?");
        int nombre = scan.nextInt();
        int[] tableau = new int[nombre];

        // Remplir le tableau avec les nbres
        for (int i = 0; i < nombre; i++) {
            System.out.println("Entrez le nombre numéro " + (i + 1) + " : ");
            tableau[i] = scan.nextInt();  // stockges dees nbres
        }
        int resultat = somEl(tableau);
        System.out.println("La somme des éléments du tableau est : " + resultat);
    }
    public static int somEl(int[] tableau) {
        int somme = 0;
            for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }

        return somme;
    }
}
