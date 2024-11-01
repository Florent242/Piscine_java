import java.util.Scanner;

public class exo15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mot = scan.next();
        System.out.println("Entrez un mot");
        if(Palindrome(mot)){
            System.out.println("Le mot " + mot + "est un palindrome");
        }else {
            System.out.println("Le mot "+mot +"n'est pas un palindrome");
        }

    }
    public static boolean Palindrome(String mot) {
        mot = mot.toLowerCase();
        String inverse = new StringBuilder(mot).reverse().toString();
        return mot.equals(inverse);
    }
    }
