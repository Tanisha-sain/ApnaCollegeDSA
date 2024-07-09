package Recursion;

public class Fibonacci {

    static int fibo(int n){
        if(n == 0 || n == 1) return n;
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Value at n = " + n + " position in Fibonacci series is " + fibo(n));

        for(int i = 0; i<10; i++){
            System.out.print(fibo(i) + " ");
        }
    }
}
