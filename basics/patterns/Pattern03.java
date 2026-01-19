package patterns;

import java.util.*;;

public class Pattern03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of rows

        for (int i = 1; i<=n;i++){
            for (int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
    
}

/*
1
12
123
1234
12345
123456
1234567

*/