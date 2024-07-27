package LinkedList;

public class MergeKSortedLists {
    static Node merge(Node h1, Node h2){
        if(h1 == null) return h2;
        if(h2 == null) return h1;
        Node t1 = h1, t2 = h2;
        Node dummy = new Node(-1);
        Node temp = dummy;
        while(t1 != null && t2 != null){
            if(t1.data < t2.data){
                temp.next = t1;
                t1 = t1.next;
            }else{
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        if(t1 == null) temp.next = t2;
        else temp.next = t1;
        return dummy.next;
    }

    static Node mergeLists(LinkedList[] arr){
        int n = arr.length;
        if(n == 0) return null;
        if(n == 1) return arr[0].head;
        if(n == 2) return merge(arr[0].head, arr[1].head);

        LinkedList[] leftHalf = new LinkedList[n/2];
        LinkedList[] rightHalf = new LinkedList[n - n/2];
        int mid = n/2;
        for(int i = 0; i<mid; i++){
            leftHalf[i] = arr[i];
        }
        for(int i = mid; i<n; i++){
            rightHalf[i-mid] = arr[i];
        }
        
        Node a = mergeLists(leftHalf);
        Node b = mergeLists(rightHalf);
        return merge(a,b);
    }
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(4);
        LinkedList list2 = new LinkedList();
        list2.addLast(3);
        list2.addLast(8);
        list2.addLast(10);
        LinkedList list3 = new LinkedList();
        list3.addLast(2);
        list3.addLast(5);

        LinkedList[] arr = new LinkedList[3];
        arr[0] = list1;
        arr[1] = list2;
        arr[2] = list3;

        list1.printList();
        list2.printList();
        list3.printList();

        Node mergedHead = mergeLists(arr);
        Node temp = mergedHead;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
