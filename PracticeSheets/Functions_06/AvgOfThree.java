package PracticeSheets.Functions_06;

public class AvgOfThree {

    public static float average(int a, int b, int c){
        return (a+b+c)/3.0f;
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            sum += (num%10);
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        int c = 19;
        System.out.println(average(a,b,c));
        System.out.println(sumOfDigits(345));
    }
}
