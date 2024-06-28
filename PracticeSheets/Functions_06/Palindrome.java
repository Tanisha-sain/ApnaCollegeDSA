package PracticeSheets.Functions_06;

public class Palindrome {
    public static boolean isPalindrome(int num){
        int rev = 0;
        int og = num;
        while(num > 0){
            int rem = num%10;
            rev = rev*10 + rem;
            num /= 10;
        }
        return (rev == og);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(321));
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(1));
    }
}
