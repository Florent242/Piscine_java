import java.util.Scanner;

public class Calcgenius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu qui affiche au démarrage
        System.out.println("Calc-Genius ;)");
        // Temps d'attente d'une seconde
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        int Choix = 0;
        boolean choixVerif = false;
        
        // Boucle pour valider le choix du menu principal
        while (!choixVerif) {
            System.out.println("Menu des opérations");
            System.out.println("1. Opération Simple");
            System.out.println("2. Opération Complexe");

            // Vérification de la saisie correcte (si un chiffre est bien entré)
            if (scanner.hasNextInt()) {
                Choix = scanner.nextInt();
                
                if (Choix == 1 || Choix == 2) {
                    choixVerif = true;
                } else {
                    System.out.println("Erreur : Choix invalide, veuillez réessayer.");
                }
            } else {
                System.out.println("Erreur : Vous devez entrer un chiffre.");
                scanner.next(); // Pour vider l'entrée incorrecte
            }
        }

        switch (Choix) {
            case 1:
                int choix = 0;
                choixVerif = false;
                
                // Boucle pour valider le sous-menu des opérations simples
                while (!choixVerif) {
                    System.out.println("1. Addition");
                    System.out.println("2. Soustraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Quitter");
                    
                    if (scanner.hasNextInt()) {
                        choix = scanner.nextInt();
                        
                        if (choix >= 1 && choix <= 5) {
                            choixVerif = true;
                        } else {
                            System.out.println("Erreur : Choix invalide, veuillez réessayer.");
                        }
                    } else {
                        System.out.println("Erreur : Vous devez entrer un chiffre.");
                        scanner.next(); // Pour vider l'entrée incorrecte
                    }
                }

                if (choix == 5) {
                    System.out.println("Merci d'avoir utilisé Calc-Genius !");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                    break;
                }

                // Lire les deux nombres pour l'opération
                System.out.print("Entrez le premier nombre : ");
                double num1 = scanner.nextDouble();

                System.out.print("Entrez le deuxième nombre : ");
                double num2 = scanner.nextDouble();

                switch (choix) {
                    case 1:
                        System.out.println("Résultat : " + addition(num1, num2));
                        break;
                    case 2:
                        System.out.println("Résultat : " + soustraction(num1, num2));
                        break;
                    case 3:
                        System.out.println("Résultat : " + multiplication(num1, num2));
                        break;
                    case 4:
                        // Vérifier la division par zéro
                        if (num2 != 0) {
                            System.out.println("Résultat : " + division(num1, num2));
                        } else {
                            System.out.println("Erreur : Division par zéro");
                        }
                        break;
                }
                break;

            case 2:
            char choixx = 0;

            choixVerif = false;
            while (!choixVerif) {
                System.out.println("a. Parité");
                System.out.println("b. Nombre premier");
                System.out.println("c. Racine carrée");
                System.out.println("d. Quitter");
            
                // Vérifier que l'utilisateur a bien entré une chaîne
                if (scanner.hasNext()) {
                    choixx = scanner.next().charAt(0); // Récupérer le premier caractère de la saisie
                    
                    // Comparer le choix avec les options disponibles
                    if (choixx == 'a' || choixx == 'b' || choixx == 'c') {
                        choixVerif = true;
                    } else {
                        System.out.println("Erreur : Choix invalide, veuillez réessayer.");
                    }
                } else {
                    System.out.println("Erreur : Vous devez entrer une lettre.");
                    scanner.next();
                }
            }
            if (choixx == 'a') {
                verifierParite();
            } else if (choixx == 'd') {
                System.out.println("Merci d'avoir utilisé Calc-Genius !");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }else 
            if (choixx == 'b') {
                verifierNombrePremier();
            } else if (choixx == 'd') {
                System.out.println("Merci d'avoir utilisé Calc-Genius !");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }if (choixx == 'c') {
                calculerRacineCarree();
            } else if (choixx == 'd') {
                System.out.println("Merci d'avoir utilisé Calc-Genius !");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
            
            if (choixx == 'd') {
                System.out.println("Merci d'avoir utilisé Calc-Genius !");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }

        }            

        // Fermer le scanner
        scanner.close();
    }

    // Méthode pour l'addition
    public static double addition(double a, double b) {
        return a + b;
    }

    // Méthode pour la soustraction
    public static double soustraction(double a, double b) {
        return a - b;
    }

    // Méthode pour la multiplication
    public static double multiplication(double a, double b) {
        return a * b;
    }

    // Méthode pour la division
    public static double division(double a, double b) {
        return a / b;
    }
    //Méthode pour la parité
    public static void verifierParite() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();
    
        if (nombre % 2 == 0) {
            System.out.println(nombre + " est un nombre pair.");
        } else {
            System.out.println(nombre + " est un nombre impair.");
        }
    }
    //Méthode pour le nombre premier
    public static void verifierNombrePremier() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();
    
        if (nombre <= 1) {
            System.out.println(nombre + " n'est pas un nombre premier.");
            return;
        }
    
        boolean estPremier = true;
        
        // On teste les diviseurs jusqu'à la racine carrée du nombre
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                estPremier = false;
                break;
            }
        }
    
        if (estPremier) {
            System.out.println(nombre + " est un nombre premier.");
        } else {
            System.out.println(nombre + " n'est pas un nombre premier.");
        }
    }
    //racine carré
    public static void calculerRacineCarree() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        double nombre = scanner.nextDouble();
    
        if (nombre < 0) {
            System.out.println("Erreur : Nous sommes sur les nombres reels et non complexes ;)");
        } else {
            double racineCarree = Math.sqrt(nombre);
            System.out.println("La racine carrée de " + nombre + " est : " + racineCarree);
        }
    }
    /* 
    @auteur Florent BOUDZOUMOU
    
    */
}
