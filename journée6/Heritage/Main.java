package journée6.Heritage;
import java.util.Scanner;

class Animal {
    protected String nom;

    // Constructeur
    public Animal(String nom) {
        this.nom = nom;
    }

    // Méthode manger
    public void manger() {
        System.out.println(nom + " mange");
    }
}

// Sous-classe Chien
class Chien extends Animal {
    // Constructeur
    public Chien(String nom) {
        super(nom);
    }

    // Redéfinition de la méthode manger
    @Override
    public void manger() {
        System.out.println(nom + " le bon chien mange");
    }
}

// Sous-classe Chat
class Chat extends Animal {
    // Constructeur
    public Chat(String nom) {
        super(nom);
    }

    // Redéfinition de la méthode manger
    @Override
    public void manger() {
        System.out.println(nom + " le bon chat mange");
    }
}

// Classe principale pour tester
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quelle est le nom du chien ?");
        String name1 = scan.next();
        Animal monChien = new Chien(name1);
        System.out.println("Quelle est le nom du chat ?");
        String name2 = scan.next();
        Animal monChat = new Chat(name2);

        monChien.manger(); 
        monChat.manger();  
    }
}
