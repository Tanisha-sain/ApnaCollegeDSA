package Recursion;

public class Power {

    static int counter = 0;

    // O(logn)
    static int optimizedPower(int base, int expo){
        counter++;
        if(expo == 0) return 1;

        int halfPowerSq = optimizedPower(base, expo/2);
        halfPowerSq *= halfPowerSq;
        if(expo%2 != 0) halfPowerSq *= base;

        return halfPowerSq;
    }

    // O(n)
    static int pow(int base, int expo){
        counter++;
        if(expo == 0) return 1;

        return base * pow(base,expo-1);
    }
    public static void main(String[] args) {
        counter = 0;
        int base = 2;
        int expo = 10;

        // int ans = pow(base,expo);
        int ans = optimizedPower(base,expo);
        System.out.println(ans + " " + counter);
    }
}
