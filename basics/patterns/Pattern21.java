package patterns;

import java.util.Scanner;

public class Pattern21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            
            /* Inner loop for printing
            the stars at borders only.*/
            for(int j = 0; j < n; j++){
                
                if(i == 0 || j == 0 || i == n-1 || j == n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            // Move to the next row.
            System.out.println();
        }
        sc.close();
    }
    
}
/*
****
*  *
*  *
****

*/
