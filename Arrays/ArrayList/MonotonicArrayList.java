package Arrays.ArrayList;
import java.util.*;

public class MonotonicArrayList {
    static boolean isMonotone(ArrayList<Integer> list){
        boolean inc = true;
        boolean dec = true;
        int n = list.size();
        for(int i = 0; i<n-1; i++){
            if(list.get(i) < list.get(i+1)){
                dec = false;
            }
            if(list.get(i) > list.get(i+1)){
                inc = false;
            }
        }
        return inc||dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(7);
        list.add(5);
        list.add(4);
        list.add(4);
        System.out.println(isMonotone(list));
    }
}
