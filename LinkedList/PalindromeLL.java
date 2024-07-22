package LinkedList;

public class PalindromeLL {
    
    static Node middleNode(LinkedList list){
        Node slow = list.head;
        Node fast = list.head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node reverseHalf(Node mid, LinkedList list){
        Node curr = mid, prev = null, nxt = null;
        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    static boolean isPalindrome(LinkedList list){
        if(list.head == null || list.head.next == null) return true;
        Node mid = middleNode(list);
        Node left = list.head;
        Node right = reverseHalf(mid, list);
        while(right != null){
            if(left.data != right.data) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i = 1; i<=3; i++){
            list.addFirst(i);
            list.addLast(i);
        }
        list.add(3,0);
        list.printList();
        
        // Node mid = middleNode(list);
        // Node right = reverseHalf(mid, list);
        // System.out.println(right.data);
        System.out.println(isPalindrome(list));
    }
}
