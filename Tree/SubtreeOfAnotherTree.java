package Tree;

// import Tree.TreeTraversal.*;

public class SubtreeOfAnotherTree {

    static boolean isIdentical(Node node1, Node node2){
        if(node1 == null && node2 == null) return true;
        if(node1 == null || node2 == null || node1.data != node2.data) return false;

        return isIdentical(node1.left, node2.left) && isIdentical(node1.right, node2.right);
    }

    static boolean isSubtree(Node root, Node subRoot){
        if(root == null) return false;
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)) return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }
}
