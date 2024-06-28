package Strings;

public class SubString {
    static String subString(String str, int i, int j){
        String sub = "";
        for(int a = i; a<j; a++){
            sub += str.charAt(a);
        }
        return sub;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(subString(str,0,5));
    }
}
