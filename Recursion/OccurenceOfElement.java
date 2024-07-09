package Recursion;

public class OccurenceOfElement {

    static int firstOccurence(int[] arr, int key, int index){
        if(index >= arr.length) return -1;
        if(arr[index] == key) return index;
        return firstOccurence(arr, key, index+1);
    }

    // static int lastOccurence(int[] arr, int key, int index){
    //     if(index < 0) return -1;
    //     if(arr[index] == key) return index;
    //     return lastOccurence(arr, key, index-1);
    // }

    static int lastOccurence(int[] arr, int key, int index){
        if(index >= arr.length) return -1;
        int isFound = lastOccurence(arr, key, index+1);
        if(isFound == -1 && arr[index] == key){
            return index;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int[] arr = {3,15,2,5,5,10,2,49,9,5,10};
        int n = arr.length;
        int index1 = firstOccurence(arr, 5,0);
        System.out.println(index1);
        // int index2 = lastOccurence(arr,5,n-1);
        int index2 = lastOccurence(arr,5,0);
        System.out.println(index2);
    }
}
