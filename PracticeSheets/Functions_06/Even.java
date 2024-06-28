package PracticeSheets.Functions_06;

public class Even {
    public static boolean isEven(int num){
        return num%2 == 0;
    }
    public static void main(String[] args) {
        System.out.println(isEven(2));
        System.out.println(isEven(455));

        // Math class functions
        System.out.println(Math.min(23,1));
        System.out.println(Math.max(200,2000));
        System.out.println(Math.sqrt(24));
        System.out.println(Math.pow(12,4));
       // System.out.println(Math.avg(23,25));
        System.out.println(Math.abs(-57));
    }
    
}
