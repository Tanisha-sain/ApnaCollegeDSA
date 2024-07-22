package LinkedList;

public class Cycle {
    static boolean isCycle(LinkedList list){
        if(list.head == null || list.head.next == null) return false;
        Node slow = list.head, fast = list.head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
    static void removeCycle(LinkedList list){
        boolean isCycle = false;
        if(list.head == null || list.head.next == null) isCycle = false;
        Node slow = list.head, fast = list.head, prev = null;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        if(!isCycle) return;
        slow = list.head;
        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        prev.next = null;
        list.tail = prev;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i = 1; i<=5; i++){
            list.addLast(i);
        }
        list.tail.next = list.head.next;

        // System.out.println(isCycle(list));
        removeCycle(list);
        list.printList();
    }
}
