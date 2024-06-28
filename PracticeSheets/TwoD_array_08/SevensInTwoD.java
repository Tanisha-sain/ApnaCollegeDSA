package PracticeSheets.TwoD_array_08;

public class SevensInTwoD {
    static int countOfSeven(int[][] arr){
        int count = 0;
        for(int[] temp : arr){
            for(int num: temp){
                if(num == 7) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {4,7,8},
            {8,8,7}
        };
        int count = countOfSeven(arr);
        System.out.println(count);
    }
}
