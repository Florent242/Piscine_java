import java.util.Scanner;
public class exo9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int longueur;
        int largeur;
        System.out.println("Calculons la surface du rectangle");
        System.out.println("Entrez la longueur :");
        longueur = scan.nextInt();
        System.out.println("Entrez la largeur");
        largeur = scan.nextInt();
        System.out.println("La surface du rectangle donne: "+Surface(longueur, largeur));
    }
    public static double Surface(int longueur, int largeur){
        return longueur * largeur;
    }
}
