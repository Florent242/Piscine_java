import java.util.Scanner;

public class exo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuilez entrer un nombre");
        int nombre=scan.nextInt();
        int fact=1;
        int a =1;

        while (a <= nombre) {
            fact = fact * a;
            a++;
        }
        System.out.println("La factorielle de "+ nombre + " est " + fact );
    }
}
