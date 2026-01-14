package language;

import java.util.*;


public class Basics {
    public static void main(String[] args) {

        // Datatypes
        // Byte: -128 to 127 (8 bits)
        Byte b1 = 22;
        System.out.println(b1);

        // Short: -32768 nto 32767 (16 bits)

        // Int: -2^31 to 2^31 - 1 (32 bits)
        int num = 234;
        System.out.println(num);

        // Long: -2^63 to 2^63 - 1 (64 bits)

        long l1 = 3442;
        System.out.println("Long:"+l1);

        // float (approx 6-7 decimal precision) - 32 bits
        float f1 = 3.45f;
        System.out.println(f1);

        // long (approx 15 decimal precision) - 64 bits
        double d1 = 3.445563;
        System.out.println(d1);

        // char
        char ch = 's';
        System.out.println("Char value:"+ch);

        // ---- Operators
        // Arithmetic Operators

        int num1 = 25;
        int num2 = 10;

        System.out.println("Addition "+ (num1+num2));
        System.out.println("Sub "+ (num1-num2));
        System.out.println("Multiply "+(num1*num2));
        System.out.println("Division:"+ (num1/num2));
        System.out.println("Remainder"+ (num1%num2));

        // Unary Operators (+,-,++,--)

        // Relational Operators (==, !=, <=, >=, >, <)

        // Logical Operators (&&, ||)

        // Assignment Operator (=)

        // Ternary Operator (condition?first_statement:second_statement)

        int n1 = 10;
        int n2 = 20;
        int bigValue = (n1>n2)?n1:n2;
        System.out.println("Big number: " + bigValue);

        // --------------------------
        // Strings
        String language = "Java";
        System.out.println(language);

        System.out.println(language.charAt(2)); // Gives character at certain index

        System.out.println(language.substring(1)); // Gives everything from second index

        System.out.println(language.substring(0,3));

        String fname = "Hello";
        String lname = "Java";
        String fullName = fname + " " + lname;
        System.out.println(fullName);

        // In Java Strings are immutable

        // equals 
        boolean result =fname.equals(lname);
        // boolean result = fname ==lname;
        System.out.println(result);

        // Input & Output
        // Scanner
        Scanner scanner = new Scanner(System.in);

        int n5 = scanner.nextInt();
        System.out.println("Scanned num:"+n5);

        String firstName = scanner.next();
        System.out.println(firstName);

        

        // Type Casting
        int intNum = 45;
        double doubleNum = intNum; // Implicit casting
        System.out.println("Double num:"+doubleNum);

        double doubleNum2 = 33.33;
        int newNum = (int) doubleNum2; // Explicit Typecasting
        System.out.println(newNum);

        // Constants - final keyword
        final int finalValue = 99;
        // finalValue = 199;
        System.out.println(finalValue);

        System.out.println("Test line1");

        // ------------------------------

        // Arrays
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;
        System.out.println("Array element at index 2:"+arr[2]);
        System.out.println(arr.length);
        // System.out.println(arr[9]);// ArrayIndexOutOfBoundsException- Runtime Error

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        // 2D array
        int[][] arr1 = {{1,2,3},{2},{3,4,5,6},{4,4,4,4}};
        System.out.println(arr1[2][2]);

       // Conditionals

       // If-Else
       int age = scanner.nextInt();
       if(age>=18){
        System.out.println("Adult");
       }
       else{
        System.out.println("Not an Adult");
       }

       // if-else-if
       int marks = scanner.nextInt();

       if(marks>90){
        System.out.println("Grade A");
       }
       else if(marks>=70){
        System.out.println("Grade B");
       }
       else if(marks>=50){
        System.out.println("Grade C");
       }
       else if(marks>=35){
        System.out.println("Grade D");
       }
       else {
        System.out.println("Fail");
       }

       // Switch Case
         int day = scanner.nextInt();
            switch(day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid Day");
            }

        // Loops
        // For Loop
        for(int i=0;i<5;i++){
            System.out.println("For Loop iteration:"+i);
        }

        // sum of elements in an array
        int size = scanner.nextInt();
        int[] arrSum = new int[size];

        for(int i = 0; i< size-1;i++){
            arrSum[i]= scanner.nextInt();
        }

        for(int i =0; i< size-1;i++){
            System.out.println(arr[i]);
        }

        int totalSum = 0;
        for(int i=0;i<size-1;i++){
            totalSum = totalSum + arr[i];
        }
        System.out.println("Array sum: " + totalSum);

        // For each
        for(int element: arrSum){
            System.out.println("Element:"+element);
        }   

        // While Loop
        int count = 0;
        while(count<5){
            System.out.println("While loop count:"+count);
            count++;
        }

        // Do-While Loop
        int cnt = 0;
        do{
            System.out.println("Do-While count:"+cnt);
            cnt++;
        }while(cnt<5);  

        // Exceptions Handling
        System.out.println("Enter numerator and denominator:");
        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();    
        try{
            int division = numerator/denominator;
            System.out.println("Division result:"+division);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator cannot be zero");
        }
        finally{
            System.out.println("Execution completed");
        }

       scanner.close();
    }
    
}
