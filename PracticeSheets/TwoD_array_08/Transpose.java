package PracticeSheets.TwoD_array_08;

public class Transpose {
    static int[][] transpose(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int[][] ans = new int[m][n];
        int i = 0, j= 0;
        for(int[] temp : arr){
            i = 0;
            for(int num : temp){
                ans[i][j] = num;
                i++;
            }
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,4},
            {5,6,2}
        };
        int[][] trans = transpose(arr);
        for(int i = 0; i<trans.length; i++){
            for(int j = 0; j<trans[i].length; j++){
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
