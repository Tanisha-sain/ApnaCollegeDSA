package Arrays;
public class SpiralMatrix {
    static void printSpiral(int[][] arr){
        int startRow = 0, startCol = 0, endRow = arr.length -1, endCol = arr[0].length-1;
        while (startRow <= endRow && startCol <= endCol) {
            for(int j = startCol; j<= endCol; j++){
                System.out.print(arr[startRow][j] + " ");
            }
            for(int j = startRow+1; j<=endRow; j++){
                System.out.print(arr[j][endCol] + " ");
            }
            for(int j = endCol-1; j>=startCol; j--){
                if(startRow == endRow) break;
                System.out.print(arr[endRow][j] + " ");
            }
            for(int j = endRow-1; j>=startRow+1;j--){
                if(startCol == endCol) break;
                System.out.print(arr[j][startCol] + " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    public static void main(String[] args) {
        // int[][] arr = {
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {9,10,11,12},
        //     {13,14,15,16}
        // };
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {4,5,6},
        };
        printSpiral(arr);
    }
}
