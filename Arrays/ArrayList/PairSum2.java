package Arrays.ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    static int pivotPoint(ArrayList<Integer> list){
        int n = list.size();
        int i = 0, j = n-1;
        while(i<j){
            int mid = i + (j-i)/2;
            // System.out.println(i + " " + j + " " + mid);
            if(mid+1 < n){
                if(list.get(mid) > list.get(mid+1)) return mid;
                else if(list.get(mid) <= list.get(j)) j = mid;
                else i = mid+1;
            }
        }
        return n-1;
    }
    static boolean isPairSum2(ArrayList<Integer> list, int target){
        int n = list.size();
        int r = pivotPoint(list);
        int l = (r+1)%n;
        // System.out.println(l + " " + r);
        // return true;
        while(l != r){
            int sum = list.get(l) + list.get(r);
            System.out.println(l + " " + r + " " + sum);
            if(sum == target) return true;
            else if(sum < target){
                l = (l+1)%n;
            }else{
                r = (r-1+n)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        int target = 16;
        System.out.println(isPairSum2(list,target));
    }
}
