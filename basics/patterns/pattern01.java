package patterns;

import java.util.Scanner;
public class pattern01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of rows

        for (int i = 1; i <= n; i++) { // Loop for each row
            for (int j = 1; j <= i; j++) { // Loop for printing stars in each row
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
        scanner.close();
    }
    
}
