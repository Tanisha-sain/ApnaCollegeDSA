package Recursion;

public class Duplicates {

    static String removeDuplicates(String str, boolean map[], int i, StringBuilder ans){
        if(i == str.length()) return ans.toString();

        if(!map[str.charAt(i) - 'a']){
            ans.append(str.charAt(i));
        }
        map[str.charAt(i) - 'a'] = true;
        return removeDuplicates(str, map, i+1, ans);
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        boolean[] map = new boolean[26];
        StringBuilder ans = new StringBuilder();
        String res = removeDuplicates(str,map,0,ans);

        System.out.println(res);
    }
}
