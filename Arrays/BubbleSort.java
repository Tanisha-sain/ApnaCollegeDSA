package Arrays;

import java.util.Arrays;
public class BubbleSort {
    static void bubblesort(int[] arr){
        int n = arr.length;
        boolean swapped = false;
        for(int i = 0; i<n-1; i++){
            swapped = false;
            for(int j = 0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) return;
        }
    }
    static void bubblesortrev(int[] arr){
        int n = arr.length;
        boolean swapped = false;
        for(int i = 0; i<n-1; i++){
            swapped = false;
            for(int j = 0; j<n-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) return;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
       // bubblesort(arr);
        bubblesortrev(arr);
        System.out.println(Arrays.toString(arr));
    }
}
