package Arrays;
public class Largest {
    public static int largest(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    public static int smallest(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,9,4,5,8};
        int max = largest(arr);
        int min = smallest(arr);
        System.out.println("Maximum element is " + max + " and Minimum element is " + min);
    }
}
