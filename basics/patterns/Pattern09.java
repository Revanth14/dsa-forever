package patterns;
import java.util.*;

public class Pattern09 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // Number of rows    
    pattern09(n);
    sc.close();
    }

public static void pattern09(int n){
    pattern07(n);
    pattern08(n);
}

private static void pattern07(int n) {

    for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            // for(int j=1;j<=(n-i);j++){
            //     System.out.print(" ");
       // }
            System.out.println();
        }
}

private static void pattern08(int n) {
       for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<((2*n-1)-(2*i));j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

/*
      *
     ***
    *****
   *******
  *********
 ***********
*************
*************
 ***********
  *********
   *******
    *****
     ***
      *


*/