package language;

class Test{
    public void testMethod(){
        System.out.println("This is a test method");
    }
    public int add(int a, int b){
        return a + b;
    }
}

abstract class Animal{
    public abstract void sound();
    public void sleep(){
        System.out.println("Zzz");
    }
}

class BankAccount{
    private double balance;
    public BankAccount(double _balance){
            balance = _balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void printBalance(){
        System.out.println(balance);
    }
}

class Car{
    private String carNumber;

    public Car(String carNumberr){
        this.carNumber = carNumberr;
    }

    public void printNumber(){
        System.out.println(this.carNumber);
    }

}

public class Oop {

    public static void main(String[] args) {

        System.out.println("OOPS Concepts in Java");
        Test test = new Test();
        test.testMethod();
        int sum = test.add(22,30);
        System.out.println("Sum is " + sum);

        BankAccount acc1 = new BankAccount(250);
        System.out.println(acc1.getBalance());

    }
    
}
// Object Oriented Programming

        // Class: Blueprint of an object
        // Object: Instance of a class

        // Four Pillars of OOP
        // 1. Encapsulation
        // 2. Inheritance
        // 3. Polymorphism
        // 4. Abstraction   

// public - everywhere
// private - within class
// protected - within package and subclasses
// default - within package

// Constructors and Parameterized constructors
