import java.util.Scanner;

public class personne {
    private String nom;
    private int age;
    private String address;

    public personne(String address){
        this.address = address;
        this.age = 20;
        this.nom = "florent";
    }
    public void Modif(String address){
        System.out.println("Entrez votre adresse:");

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez votre adresse:");
        String addresse = scan.nextLine();
        personne pers = new personne(addresse);
        System.out.println("Votre adresse est: " +addresse);
        scan.close();

    }
}
