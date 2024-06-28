package Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key){
        int s = 0, e = arr.length - 1;
        while(s <= e){
            int mid = (s+e)/2;
            if(arr[mid] == key) return mid;
            else if(arr[mid] < key) s = mid+1;
            else e = mid -1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,9,10,13,20};
        int key = 10;
        int index = binarySearch(arr, key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Key found at index " + index);
        }
    }

}
