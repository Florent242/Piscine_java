import java.util.Scanner;

public class exo14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez remplir le tableau :");
        int[] nombre = new int[10];
        for(int i=0; i < 10; i++){
            nombre[i] = scan.nextInt();
        }
        System.out.println("Le tableau donne:");
        for (int i = 0; i < 10; i++) {
            System.out.print(nombre[i] + " ");
        }
        System.out.println();
        System.out.println("Entrez un nombre que nous devinerons: ");
        int dev = scan.nextInt();
        boolean trouvé = false;

        for (int i = 0; i < 10; i++) {
            if (dev == nombre[i]) {
                System.out.println("Le nombre deviné " + dev + " est dans le tableau");
                trouvé = true;
                break;
            }
        }

        if (!trouvé) {
            System.out.println("Le nombre deviné " + dev + " n'est pas dans le tableau");
        }
        
        scan.close(); 
    }
}
