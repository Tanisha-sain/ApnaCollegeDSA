package PracticeSheets;

public class BitManipulation {
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

    // public static int toBinary(int n){
    //     int bin = 0;
    //     int i = 0;
    //     while(n != 0){

    //     }
    //     return bin;
    // }

    public static void main(String[] args) {
        oddOrEven(6);
        oddOrEven(7);
        System.out.println(getIthBit(5, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2,1));
    }
}
