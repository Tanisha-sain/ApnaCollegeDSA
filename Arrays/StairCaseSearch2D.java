package Arrays;
import java.util.*;
public class StairCaseSearch2D {
    static int[] staircase(int[][] mat, int key){
        int n= mat.length;
        int m = mat[0].length;
        int row =0, col = m-1;
        int[] ans = new int[2];
        while(row < n && col >=0){
            if(key == mat[row][col]){
                ans[0] = row;
                ans[1] = col;
                return ans;
            }else if(key > mat[row][col]){
                row++;
            }else{
                col--;
            }
        }
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int[] index = staircase(mat,11);
        if(index[0] == -1 || index[1] == -1){
            System.out.println("key not found");
        }else{
            System.out.println("Key found at i = "+ index[0] + " and j = " + index[1]);
        }
    }
}
