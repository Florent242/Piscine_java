import java.util.Scanner;
import java.util.ArrayList;
public class exo10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Salut, on fait la conversion des Celsius en Fahrenhet :)");
        System.out.println("Entrez la temperature a convertir");
        int temp = scan.nextInt();
        System.out.println("La conversion de "+ temp + " Celsius donne : "+ Conversion(temp)+ " Fahrenheit.");
    }
    public static int Conversion(int Celsius){
        int Fahrenheit = Celsius * 9/5 + 32;
        return Fahrenheit;

    }
}
