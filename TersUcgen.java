import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Basamak sayısı:");
        int step = scan.nextInt();

        for (int i= step; i>=1; i--){

            for(int k=1; k<=(step-i); k++){
                System.out.print(" ");
            }

            for (int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
