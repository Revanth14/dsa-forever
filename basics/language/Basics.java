package language;

import java.util.*;


public class Basics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a + b;
        System.out.println("Sum is " +  c);

        System.out.println("Hello Java!");
        System.out.println("Line 2");
        System.out.println("Line 3.0");

        sc.close();
    }
    
}
