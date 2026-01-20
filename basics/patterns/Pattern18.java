package patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =0;i<n;i++){
            char el = (char)('A'+n-1);
            for(char ch = (char)(el-i);ch<=el;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        sc.close();


    }
    
}

/*
D 
C D 
B C D 
A B C D 

*/