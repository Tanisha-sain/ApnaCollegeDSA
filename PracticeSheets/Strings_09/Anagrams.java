package PracticeSheets.Strings_09;
public class Anagrams {
    static boolean checkAnagram(String s1, String s2){
        int[] str1 = new int[26];
        int[] str2 = new int[26];
        for(char ch : s1.toCharArray()){
            str1[ch-'a']++;
        }
        for(char ch : s2.toCharArray()){
            str2[ch-'a']++;
        }
        for(int i = 0; i<26; i++){
            if(str1[i] != str2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "ra";
        String s2 = "ar";
        System.out.println(checkAnagram(s1.toLowerCase(),s2.toLowerCase()));
    }
    
}
