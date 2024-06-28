package Arrays;
import java.util.*;

public class SelectionSort {
    static void selectionsort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int smallest = i;
            for(int j = i+1; j<n; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
    static void selectionsortrev(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int smallest = i;
            for(int j = i+1; j<n; j++){
                if(arr[smallest] < arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        selectionsortrev(arr);
        System.out.println(Arrays.toString(arr));
    }
}
