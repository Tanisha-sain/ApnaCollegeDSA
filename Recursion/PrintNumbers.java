package Recursion;

public class PrintNumbers {
    static void printNumbersInDecreasingOrder(int n){
        if(n == 0) return;
        System.out.print(n + " ");
        printNumbersInDecreasingOrder(n-1);
    }
    static void printNumbersInIncreasingOrder(int n){
        if(n == 0) return;
        printNumbersInIncreasingOrder(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        printNumbersInDecreasingOrder(10);
        System.out.println();
        printNumbersInIncreasingOrder(10);
    }
}
