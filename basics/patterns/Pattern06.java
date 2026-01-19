package patterns;

import java.util.*;;

public class Pattern06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of rows

        for (int i = 1; i<=n;i++){
            for (int j=1; j<=(n-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
1234567
123456
12345
1234
123
12
1

*/