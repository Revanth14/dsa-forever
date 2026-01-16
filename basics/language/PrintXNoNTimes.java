package language;

import java.util.*;

public class PrintXNoNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        for(int i=0; i<n;i++){
            if(i==n-1){
            System.out.print(x);
            }
            else{
            System.out.print(x+" ");
            }
        }
        System.out.println();

        sc.close();
    }
    
}

/*
input: 
5
9

output:
9 9 9 9 9

*/