package PracticeSheets;

public class BitManipulation_10 {
    public static void oddOrEven(int n){
        int bitmask = 1;
        if((n&bitmask) == 1){
            System.out.println("odd number");
        }else{
            System.out.println("even number");
        }
    }

    public static int getIthBit(int n, int i){
        if((n & (1<<i)) == 0) return 0;
        else return 1;
    }

    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    public static int updateIthBit(int n, int i, int newbit){
        n = clearIthBit(n, i);
        int bitmask = newbit<<i;
        return n|bitmask;
    }

    public static int clearLastIbits(int n, int i){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n&bitmask;
    }

    public static boolean powerOfTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static int toBinary(int n){
        int bin = 0;
        for(int i = 31; i>=0; i--){
            bin = bin*10 + getIthBit(n, i);
        }
        return bin;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n&1) != 0) count++;
            n = n>>1;
        }
        return count;
    }

    public static int fastExponentiation(int i, int j){
        int ans = 1;
        while(j > 0){
            if((j&1) != 0){
                ans = ans*i;
            }
            i = i*i;
            j = j>>1;
        }
        return ans;

    }

    public static void swap(int a, int b){
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // a = a+b;
        // b = a-b;
        // a = a-b;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static int addOne(int n){
        return -~n;
    }

    public static char upperToLower(char upp){
        int asc = (int)upp;
        int bitmask = 1<<5;
        int ans = asc | bitmask;
        return (char)ans;
    }

    public static void main(String[] args) {
        // oddOrEven(6);
        // oddOrEven(7);
        // System.out.println(getIthBit(5, 2));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(10, 2,1));
        // System.out.println(clearLastIbits(15, 2));
        // System.out.println(clearBitsInRange(19, 1, 3));
        // System.out.println(powerOfTwo(8));
        // System.out.println(toBinary(90));
        // System.out.println(countSetBits(10));
        System.out.println(fastExponentiation(5, 3));
        swap(4, 5);
        System.out.println(addOne(6));
        System.out.println(upperToLower('A'));
        // System.out.println((int)' ');
    }
}
