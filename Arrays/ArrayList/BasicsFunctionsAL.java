package Arrays.ArrayList;
import java.util.ArrayList;
public class BasicsFunctionsAL {

    static int maximum(ArrayList<Integer> list){
        int n = list.size();
        int max = list.get(0);
        for(int i = 1; i<n; i++){
            if(list.get(i) > max) max = list.get(i);
        }
        return max;
    }

    static void swap(ArrayList<Integer> list, int ind1, int ind2){
        int temp = list.get(ind1);
        list.set(ind1, list.get(ind2));
        list.set(ind2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(1);
        list.add(10);
        list.add(3);
        list.add(8);
        
        // Printing list in its original order
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // After swapping indices 1 and 3
        swap(list,1,3);
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Printing elements of list in reverse order
        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println("Maximum element is " + maximum(list));

    }
}
