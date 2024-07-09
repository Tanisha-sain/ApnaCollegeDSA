// Given a "2 X n" board and tiles of size "2 X 1", count the no. of ways to tile the given board.

package Recursion;

public class TilingProblem {

    static int countWays(int n){
        if(n == 0 || n == 1) return 1;

        return countWays(n-1) + countWays(n-2);
    }
    public static void main(String[] args) {
        int n = 4; // board size 2 X n
        int ways = countWays(n);
        System.out.println(ways);
    }
}
