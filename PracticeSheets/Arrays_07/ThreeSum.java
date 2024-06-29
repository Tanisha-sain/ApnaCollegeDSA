package PracticeSheets.Arrays_07;
import java.util.*;

public class ThreeSum {
    // O(n^3)
    static void printTripletsBrute(int[] nums){
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i<n-2; i++){
            for(int j = i+1; j<n-1; j++){
                for(int k = j+1; k<n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        if(!set.contains(list)) ans.add(list);
                        set.add(list);
                    }
                }
            }
        }
        for(int i = 0; i<ans.size(); i++){
            for(int j = 0; j<ans.get(i).size(); j++){
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    // O(n^2 * log m)
    static void printTripletsHashing(int[] nums){
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            Set<Integer> st = new HashSet<>();
            for(int j = i+1; j<n; j++){
                int third = -(nums[i] + nums[j]);
                if(st.contains(third)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    Collections.sort(temp);
                    set.add(temp);
                }
                st.add(nums[j]);
            }
        }
        for(List<Integer> list : set){
            System.out.println(list);
        }
    }

    // O(nlogn + n^2)
    static void printTripletsTwoPointer(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        for(ArrayList<Integer> list : ans){
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        printTripletsTwoPointer(nums);
    }
}
