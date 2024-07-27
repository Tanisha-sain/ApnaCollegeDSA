package Linkedlist;

public class OddEven{

    static void makeOddEven(LinkedList list){
        Node oddlist = new Node(-1);
        Node evenlist = new Node(-1);
        Node odd = oddlist, even = evenlist;
        Node temp = list.head;
        while(temp != null){
            if(temp.data % 2 == 0){
                even.next = temp;
                even = even.next;
            }else{
                odd.next = temp;
                odd = odd.next;
            }
            temp = temp.next;
        }
        even.next = null;
        odd.next = evenlist.next;
        list.head = oddlist.next;
        if(odd.next == null) list.tail = odd;
        else list.tail = even;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i = 2; i<10;i++){
            list.addLast(i*3 + i + 1);
        }

        makeOddEven(list);
        list.printList();
        System.out.println(list.head.data + " " + list.tail.data);
    }
}