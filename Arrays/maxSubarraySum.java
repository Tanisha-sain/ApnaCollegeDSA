package Arrays;

public class maxSubarraySum {
    public static int maxSumBruteForce(int[] arr){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                int currSum = 0;
                for(int k = i; k<=j; k++){
                    currSum += arr[k];
                }
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
    public static int maxSumPrefix(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        int maxSum = Integer.MIN_VALUE;
        prefix[0] = arr[0];
        for(int i = 1; i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                int currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i-1];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        return maxSum;
    }
    public static int maxSumKadane(int[] arr){
        int currSum = 0, maxSum = Integer.MIN_VALUE, n = arr.length;
        for(int i = 0; i<n; i++){
            currSum += arr[i];
            if(currSum < 0) currSum = 0;
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        int ans = maxSumKadane(arr);
        System.out.println(ans);
    }
}
