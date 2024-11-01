import java.util.Scanner;
public class exo12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vérifions si votre nombre est premier ou non");
        System.out.println("Entrez un nombre");
        int nombre = scan.nextInt();
        if (isPremier(nombre)) {
            System.out.println("Le nombre " + nombre + " est premier.");
        } else {
            System.out.println("Le nombre " + nombre + " n'est pas premier.");
        }
    }

    public static boolean isPremier(int nombre) {
        if (nombre <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                return false;
            }
        }
        return true;
    }
}
