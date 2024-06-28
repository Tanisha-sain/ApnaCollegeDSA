package Strings;

public class UpperCase {
    static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i-1) == ' '){
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "h ello  wORLd ";
        System.out.println(toUpperCase(str));
    }
}
