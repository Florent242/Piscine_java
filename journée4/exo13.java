import java.util.Scanner;

public class exo13 {
    // manipulation des tableaux inversés
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //
        int[] nombre = new int[5];
//insertion dans le tableau
        System.out.println("Entrez les valeurs:");
        for (int i = 0; i < 5; i++) {
            nombre[i] = scan.nextInt();
        }
//inverser le tableau en algorithmique
/*    Début

    Lire la taille du tableau (taille)

    Déclarer un tableau d'entiers de taille "taille"

    Pour i de 0 à taille - 1

        Lire la valeur et l'affecter à tableau[i]

    Pour i de 0 à (taille / 2) - 1

        Échanger tableau[i] avec tableau[taille - i - 1]

    Afficher les valeurs du tableau inversé

    Fin */
for (int i = 0; i < 5 / 2; i++) {
    int stocké = nombre[i];
    nombre[i] = nombre[5 - i - 1];
    nombre[5 - i - 1] = stocké;
}

        System.out.println("Le tableau inversé donne:");
        for (int i = 0; i < 5; i++) {
            System.out.print(nombre[i] + " ");
        }
    }

}
