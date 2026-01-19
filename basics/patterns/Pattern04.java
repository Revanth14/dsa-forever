package patterns;

import java.util.*;;

public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of rows

        for (int i = 1; i<=n;i++){
            for (int j=1; j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
    
}

/*
1
22
333
4444
55555
666666
7777777

*/