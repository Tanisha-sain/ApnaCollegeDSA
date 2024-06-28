// Given an integer array nums, return true if any value appears atleast twice in the array, and return false if every element is distinct.

package PracticeSheets.Arrays_07;

import java.util.HashSet;

public class DistinctElements {
    // O(n^2)
    static boolean distinct(int[] nums){
        int n = nums.length;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1;j<n;j++){
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
    // O(n)
    static boolean distinctSet(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(distinctSet(nums));
        
    }
}
