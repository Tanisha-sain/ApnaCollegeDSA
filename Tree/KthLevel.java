package Tree;

public class KthLevel {

    static void printHelper(Node root, int k, int curr){
        if(root == null) return;
        if(curr == k){
            System.out.print(root.data + " ");
            return;
        }
        printHelper(root.left, k, curr+1);
        printHelper(root.right, k, curr+1);
    }

    static void printKthLevel(Node root, int k){
        if(k < 1) return;
        printHelper(root, k, 1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 4;
        printKthLevel(root, k);
    }
}
