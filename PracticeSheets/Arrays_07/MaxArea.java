package PracticeSheets.Arrays_07;

public class MaxArea {
    static int maxArea(int[] nums){
        int max = 0;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int area = 0;
            int l = Math.min(nums[left], nums[right]);
            int w = Math.abs(right-left);
            area = l*w;
            max = Math.max(max, area);
            if(nums[left] <= nums[right]) left++;
            else right--;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,3,4,8,7};
        System.out.println(maxArea(arr));
    }
}
