import java.util.Scanner;
/*
public class CompteBancaire {
        private int solde;
        private String titulaire;

        public CompteBancaire(){
            this.solde=0;
            this.titulaire="";
        }
        
        public void Deposer(int montant){
            if (montant > 0){
                solde = this.solde + montant;
                System.out.println("Montant déposé. Nouveau solde :" + solde);
            }else System.out.println("Le montant doit etre positif");
            
        }
        public void Retirer(int montant){
            if (montant > 0 && montant <= this.solde){
                solde = this.solde - montant;
                System.out.println("Montant retiré. Nouveau solde :" + solde);
            }else System.out.println("Retrait non autorisé");
        }

        public void AfficheSolde(String titulaire, int solde){
            System.out.println("M. "+ this.titulaire +" votre solde est de :"+ solde);
        }
        public static void main(String[] args) {
            CompteBancaire CB = new CompteBancaire();
            Scanner scan = new Scanner(System.in);
            System.out.println("Quelle est votre nom");
            String titulaire = scan.next();

            int d = CB.Deposer(500);
            CB.AfficheSolde(titulaire, d);
        }
    }   
*/


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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Demander le nom du titulaire
        System.out.println("Quel est votre nom ?");
        String titulaire = scan.next();

        // Créer un compte pour le titulaire
        CompteBancaire CB = new CompteBancaire(titulaire);

        // Déposer de l'argent
        CB.Deposer(500);
        // Afficher le solde
        CB.AfficheSolde();

        // Retirer de l'argent (exemple)
        CB.Retirer(200);
        CB.AfficheSolde();

        // Fermer le scanner
        scan.close();
    }
}
