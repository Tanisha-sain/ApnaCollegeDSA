package PracticeSheets;

import java.util.Scanner;

public class Loops_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for(int i = 0; i<5; i++){
        //     System.out.println("Hello");
        //     i+=2;
        // }

        // int n = sc.nextInt();
        // int odd_sum = 0, even_sum = 0;

        // for(int i = 0; i<n; i++){
        //     int a = sc.nextInt();
        //     if(a%2 == 0){
        //         even_sum += a;
        //     }else{
        //         odd_sum += a;
        //     }
        // }
        // System.out.println(odd_sum + " " + even_sum);


        // int num = sc.nextInt();
        // int fact = 1;
        // while(num > 0){
        //     fact = fact * num;
        //     num = num - 1;
        // }
        // System.out.println(fact);

        // int n = sc.nextInt();
        // for(int i = 1; i<11; i++){
        //     System.out.println(n + " X " + i + " = " + n*i);
        // }
        int i = 0;
        for(i = 0; i<=5; i++){
            System.out.println("i = " + i);
        }
        System.out.println("i after the loop = " + i);

        
        sc.close();
    }
}
