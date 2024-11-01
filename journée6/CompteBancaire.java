import java.util.Scanner;

public class CompteBancaire {
    private int solde;
    private String titulaire;

    // Constructeur
    public CompteBancaire(String titulaire) {
        this.titulaire = titulaire;
        this.solde = 0; // Le solde initial est 0
    }

    // Méthode pour déposer de l'argent
    public void Deposer(int montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Montant déposé. Nouveau solde : " + solde);
        } else {
            System.out.println("Le montant doit être positif");
        }
    }

    // Méthode pour retirer de l'argent
    public void Retirer(int montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Montant retiré. Nouveau solde : " + solde);
        } else {
            System.out.println("Retrait non autorisé");
        }
    }

    // Méthode pour afficher le solde
    public void AfficheSolde() {
        System.out.println("M. " + this.titulaire + ", votre solde est de : " + solde);
    }

    // Getter pour le solde
    public int getSolde() {
        return solde;
    }

    // Setter pour le solde
    public void setSolde(int solde) {
        if (solde >= 0) {
            this.solde = solde;
            System.out.println("Le solde a été mis à jour. Nouveau solde : " + this.solde);
        } else {
            System.out.println("Le solde ne peut pas être négatif.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Demander le nom du titulaire
        System.out.println("Quel est votre nom ?");
        String titulaire = scan.nextLine();

        // Créer un compte pour le titulaire
        CompteBancaire CB = new CompteBancaire(titulaire);

        // Déposer de l'argent
        System.out.println("Combien voulez vous déposer ?");
        int depot = scan.nextInt();
        CB.Deposer(depot);
        // Afficher le solde
        CB.AfficheSolde();

        // Retirer de l'argent (exemple)
        System.out.println("Combien voulez vous retirer ?");
        int retrait = scan.nextInt();
        CB.Retirer(retrait);
        CB.AfficheSolde();

        // Utilisation des méthodes getter et setter
        System.out.println("Solde actuel (via getter) : " + CB.getSolde());
        int sold = depot - retrait;
        CB.setSolde(sold); // Mise à jour du solde
        CB.AfficheSolde();

        // Fermer le scanner
        scan.close();
    }
}
