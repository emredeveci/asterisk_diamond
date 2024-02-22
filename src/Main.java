
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable initialization
        int rows;

        //scanner initialization and user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        rows = scanner.nextInt();

        //the loop that prints the top half of the diamond
        for (int i = 0; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //the loop that prints the bottom half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}