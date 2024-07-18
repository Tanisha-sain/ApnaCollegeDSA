package Arrays.ArrayList;
import java.util.*;

public class PairSum1 {
    // Brute Force - O(n^2)
    static void printPairSumBF(ArrayList<Integer> list, int target){
        for(int i = 0; i<list.size()-1; i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    System.out.println("Pair: " + i + ", " + j);
                }
            }
        }
    }

    // Two pointer - O(n)
    static boolean isPairSum(ArrayList<Integer> list, int target){
        int n = list.size();
        int l = 0, r = n-1;
        while(l < r){
            int sum = list.get(l) + list.get(r);
            if(sum == target) return true;
            else if(sum < target) l++;
            else r--;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(0);
        list.add(5);
        int target = 5;
        // printPairSumBF(list,target);
        System.out.println(isPairSum(list, target));
    }
}
