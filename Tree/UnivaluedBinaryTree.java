package Tree;

public class UnivaluedBinaryTree {

    static boolean helper(Node root, int val){
        if(root == null) return true;
        if(root.data != val) return false;

        return helper(root.left, val) && helper(root.right, val);
    }
    static boolean isUnivalued(Node root){
        if(root == null) return true;
        int val = root.data;
        return helper(root, val);
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        root.right.left = new Node(2);
        root.right.right = new Node(2);

        System.out.println(isUnivalued(root));
    }
}
