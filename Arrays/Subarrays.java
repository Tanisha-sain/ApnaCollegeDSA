package Arrays;

public class Subarrays {
    public static void printSubarrays(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = i; j < n; j++){
                System.out.print("(");
                for(int k = i; k<=j; k++){
                    if(k == j){
                        System.out.print(arr[k]);
                    }
                    else System.out.print(arr[k] + " ");
                }
                System.out.print(") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printSubarrays(arr);
    }
}
