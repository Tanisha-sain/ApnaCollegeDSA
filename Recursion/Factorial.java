package Recursion;

public class Factorial {
    static int factorial(int n){
        if(n == 0 || n == 1) return 1;
        return n*factorial(n-1);
    }

    static int sum(int n){
        if(n == 1) return 1;
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        // int fact = factorial(n);
        // System.out.println("Factorial of "  + n + " is " + fact);

        int sumn = sum(n);
        System.out.println("Sum of " + n + " natural numbers is " + sumn);
    }
}
