package PracticeSheets.Strings_09;

public class LowerCaseVowels {
    static int lowervowels(String str){
        int count = 0;
        for(char ch: str.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "This is a lowercase vowels count program";
        int count = lowervowels(str);
        System.out.println(count);
        String str1 = "Apna1C1o11llege".replace("1", "");
        System.out.println(str1);
    }
}
