package Linkedlist;

// Delete n nodes after m nodes;
public class DeleteNNodes {

    static void deleteNnodes(LinkedList list, int m, int n){
        Node head = list.head;
        Node temp = head;
        int i = 0;
        while(temp != null && i < m-1){
            temp = temp.next;
            i++;
        }
        if(temp == null){
            list.head = null;
            return;
        }
        Node temp2 = (m == 0) ? temp : temp.next;
        i = 0;
        while(temp2 != null && i < n-1){
            temp2 = temp2.next;
            i++;
        }
        if(temp2 == null || temp2.next == null){
            list.tail = temp;
            temp.next = null;
            return;
        }
        if(m == 0) list.head = temp2.next;
        else temp.next = temp2.next;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i = 1; i<=10; i++){
            list.addLast(i);
        }
        int m = 9, n = 10;
        deleteNnodes(list,m,n);
        list.printList();
        System.out.println(list.head.data + " " + list.tail.data);
    }
}
