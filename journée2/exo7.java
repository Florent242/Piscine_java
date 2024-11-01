import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Demander à l'utilisateur de saisir une chaîne de caractères
        System.out.println("Veuillez saisir une chaîne de caractères : ");
        String chaine = scan.nextLine();
        //initialiser la valeur à 0
        int compteurVoyelles = 0;
        // Convertir la chaîne en minuscules
        chaine = chaine.toLowerCase();

        // Parcourir chaque caractère de la chaîne
        for (int i = 0; i < chaine.length(); i++) {
            char c = chaine.charAt(i);

            // Vérifier si le caractère est une voyelle
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                compteurVoyelles++;
            }
        }
        System.out.println("La chaîne contient " + compteurVoyelles + " voyelle(s) .");
    }
} 