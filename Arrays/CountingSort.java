package Arrays;
import java.util.*;

public class CountingSort {
    static void countsort(int[] arr){
        int n = arr.length;
        int max = arr[0];
        for(int i = 1; i<n;i++){
            if(arr[i] > max) max = arr[i];
        }
        int[] count = new int[max+1];
        for(int num : arr){
            count[num]++;
        }
        int j = 0;
        for(int i = 0; i<=max; i++){
            while(count[i] > 0){
                arr[j++] = i;
                count[i]--; 
            }
        }
    }
    static void countsortrev(int[] arr){
        int n = arr.length;
        int max = arr[0];
        for(int i = 1; i<n;i++){
            if(arr[i] > max) max = arr[i];
        }
        int[] count = new int[max+1];
        for(int num : arr){
            count[num]++;
        }
        int j = 0;
        for(int i = max; i>=0; i--){
            while(count[i] > 0){
                arr[j++] = i;
                count[i]--; 
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};
        countsortrev(arr);
        System.out.println(Arrays.toString(arr));
    }
}
