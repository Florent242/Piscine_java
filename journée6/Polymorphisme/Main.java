import java.util.Scanner;

// Classe Animal
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

        // Création d'un tableau d'objets Animal
        Animal[] animaux = new Animal[4];

        // Demande les noms
        System.out.println("Quel est le nom du chien ?");
        String name1 = scan.next();
        System.out.println("Quel est le nom du chat ?");
        String name2 = scan.next();

        // Remplir le tableau avec un chien et un chat
        animaux[0] = new Chien(name1); // Premier chien
        animaux[1] = new Chat(name2);  // Premier chat

        // Si tu veux ajouter plus de chiens et de chats, tu peux le faire ici
        // Par exemple, ajoutons un autre chien et un autre chat
        animaux[2] = new Chien(name1+ " 1"); // Chien supplémentaire
        animaux[3] = new Chat(name2 +" chou");  // Chat supplémentaire

        // Faire manger tous les animaux dans une boucle
        for (Animal animal : animaux) {
            animal.manger();
        }
        scan.close();
    }
}
