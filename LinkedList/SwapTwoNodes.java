package Linkedlist;

public class SwapTwoNodes {

    static void swap(LinkedList list, int x, int y){
        if(x == y) return;
        Node head = list.head;
        Node prevX = null, currX = head;
        while(currX != null && currX.data != x){
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while(currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
        }
        if(currX == null || currY == null) return;
        if(prevX != null){
            prevX.next = currY;
        }else{
            list.head = currY;
        }

        if(prevY != null){
            prevY.next = currX;
        }else{
            list.head = currX;
        }
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i = 9; i>4; i--){
            list.addLast(i);
        }
        swap(list, 5, 9);
        list.printList();
    }
}
