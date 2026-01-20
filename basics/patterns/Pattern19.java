package patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

         int iniS = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            
            // Printing the stars in the row.
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            
            /* The spaces increase by 2 
            every time we hit a new row. */
            iniS += 2;
            
            // Give a line break for a new row.
            System.out.println();
        }
        
        // Print the lower half pattern
        
        // Store the initial spaces.
        iniS = 2 * n - 2;
        
        for (int i = 1; i <= n; i++) {
            // Printing the stars in the row.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Printing the spaces in the row.
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            
            // Printing the stars in the row.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            /* The spaces decrease by 2 
            every time we hit a new row. */
            iniS -= 2;
            
            // Give a line break for a new row.
            System.out.println();
        }
        sc.close();
    }
    
}

/*
********
***  ***
**    **
*      *
*      *
**    **
***  ***
********

 */