package Arrays.ArrayList;
import java.util.*;
public class ContainerWithMostWater{

    // O(n^2)
    static int mostWaterBruteForce(ArrayList<Integer> height){
        int n = height.size();
        int maxWater = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = i; j<n; j++){
                maxWater = Math.max(Math.min(height.get(i), height.get(j))*(j-i), maxWater);
            }
        }
        return maxWater;
    }

    // O(n)
    static int mostWaterTwoPointer(ArrayList<Integer> height){
        int n = height.size();
        int maxWater = 0;
        int i = 0, j = n-1;

        while(i < j){
            if(height.get(i) < height.get(j)){
                maxWater = Math.max(maxWater, height.get(i)*(j-i));
                i++;
            }else{
                maxWater = Math.max(maxWater, height.get(j)*(j-i));
                j--;
            }
        }
        
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // int maxWater = mostWaterBruteForce(height);
        int maxWater = mostWaterTwoPointer(height);
        System.out.println(maxWater);
    }
}