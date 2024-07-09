package Recursion;

public class Sorted {
    static int counter = 0;
    static boolean isSorted(int[] arr, int i){
        counter++;
        if(i >= arr.length - 1) return true;
        return arr[i] <= arr[i+1] && isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        counter = 0;
        int[] arr = {1,3,2,5,6,7};
        boolean ans = isSorted(arr,0);
        if(ans) System.out.println("Given array is sorted in ascending order.");
        else System.out.println("Given array is not sorted");
        System.out.println(counter);
    }
}
