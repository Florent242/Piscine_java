

import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("J'affiche le nombre le plus grand");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        int nombre=0;
        int nombre2=0;
        int nombre3=0;
        System.out.println("Entrez un nombre");
        nombre = scanner.nextInt();
        System.out.println("Entrez un second");
        nombre2 = scanner.nextInt();
        System.out.println("Entrez un dernier");
        nombre3 = scanner.nextInt();

    if (nombre>=nombre2 && nombre>= nombre3){
            System.out.println("Le nombre le plus grand est :" + nombre );
    }else if (nombre2>=nombre && nombre2>=nombre3){
            System.out.println("Le nombre le plus grand est :" + nombre2 );
        }else {
            System.out.println("Le nombre le plus grand est :" + nombre3 );
        }
    }
}