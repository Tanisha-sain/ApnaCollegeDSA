package PracticeSheets;

import java.util.Scanner;

public class VariablesAndDataTypes_01{

    static int average(int A, int B, int C){ 
       // System.out.println(((Object)((A+B+C)/3)).getClass().getSimpleName());
        return (A+B+C)/3;
    }
    static int areaOfSquare(int side){
        return side*side;
    }
    static float totalCost(float a, float b, float c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println(average(a, b, c));
        // int side = sc.nextInt();
        // System.out.println(areaOfSquare(side));
        // float pc = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float er = sc.nextFloat();
        // System.out.println(totalCost(pc, pen, er));



        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f*b) + (i%c) - (d*s);
        System.out.println(f*b);
        System.out.println(i%c);
        System.out.println(d*s);
        System.out.println(result);

        int $ = 123;
        System.out.println($);
        


        sc.close();
    }
}