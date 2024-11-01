import java.util.Scanner;
public class exo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenu sur mon programme de multiplcation");
        System.out.println("Quelle est la table de multiplication dont voulez-vous voir?");
        int mult =0;
        int rep=0;
        mult = scan.nextInt();
        System.out.println("Vous avez selectionné: "+ mult);
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){}
        multiplcation(rep, mult);

    }
   // méthode de la multiplication
    public static void multiplcation(int rep, int mult){
        for(int i=0; i<=10 ; i++){
            rep = mult * i;
            System.out.println(mult + " * " + i + " = " + rep); 
        }
    }

}
