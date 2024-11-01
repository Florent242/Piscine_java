import java.util.Scanner;

public class exo16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*procédure tri_selection(tableau t)
      //n ← longueur(t) 
      pour i de 0 à n - 2
          min ← i       
          pour j de i + 1 à n - 1
              si t[j] < t[min], alors min ← j
          fin pour
          si min ≠ i, alors échanger t[i] et t[min]
      fin pour
  fin procédure*/
    System.out.println("Veuillez remplir le tableau :");
    int[] tableau = new int[6];
    for(int i=0; i < 6; i++){
        tableau [i] = scan.nextInt();
    }
    System.out.println("\nLe tableau donne:");
    for (int i = 0; i < 6; i++) {
        System.out.print(tableau[i] + " ");
    }
        Selection(tableau);

    System.out.println("\nLe tableau trié donne:");
    for (int i = 0; i < 6; i++) {
            System.out.print(tableau[i] + " ");
        }
    }
    public static void Selection (int tableau[]){
            int n = tableau.length;
            for(int i=0; i<=n-1;i++ ){
                int min = i;
                for(int j=i+1;j<=n-1;j++){
                    if(tableau[j]< tableau[min]){
                        min = j;
                    }
                }if (min != i){
                    int temp;
                    temp = tableau[i];
                    tableau[i] = tableau[min];
                    tableau[min] = temp;
                }
            }
    }
}
