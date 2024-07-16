package Arrays.ArrayList;
import java.util.ArrayList;
public class ReverseAL {
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

        // Printing elements of list in reverse order
        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
