package Strings;

public class LargestString {
    static String largeString(String[] list){
        String large = list[0];
        for(int i = 1; i<list.length; i++){
            int n = large.compareToIgnoreCase(list[i]);
            if(n < 0) large = list[i];
        }
        return large;
    }
    public static void main(String[] args) {
        String[] list = {"apple", "mango", "banana"};
        String largestr = largeString(list);
        System.out.println(largestr);
    }
}
