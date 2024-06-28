package Arrays;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,1,8,90,13,34};
        int key = 90;
        int index = linearSearch(arr,key);
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println("key found at index " + index);
        }
    }
}
