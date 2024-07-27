package Linkedlist;
import java.util.LinkedList;
public class JCF {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addLast(1);
        list.addLast(2);
        list.addFirst(8);
        list.addFirst(7);
        System.out.println(list);

        list.removeLast();
        list.removeFirst();
        System.out.println(list);
    }
}
