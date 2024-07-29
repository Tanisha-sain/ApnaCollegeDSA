package Tree;

import Tree.TreeTraversal.BinaryTree;

public class DiameterOfTree {

    public static class Info{
        int diameter;
        int height;

        Info(int d, int h){
            diameter = d;
            height = h;
        }
    }

    static BinaryTree btree = new BinaryTree();

    // O(n^2)
    public static int diameter(Node root){
        if(root == null) return 0;
        int leftDia = diameter(root.left);
        int leftHeight = btree.height(root.left) + 1;
        int rightDia = diameter(root.right);
        int rightHeight = btree.height(root.right) + 1;
        int selfDia = leftHeight + rightHeight + 1;
        return Math.max(leftDia, Math.max(rightDia, selfDia));
    }

    // O(n)
    public static Info diameterAndHeight(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameterAndHeight(root.left);
        Info rightInfo = diameterAndHeight(root.right);

        int dia = Math.max(leftInfo.height + rightInfo.height + 1, Math.max(leftInfo.diameter, rightInfo.diameter));
        int height = Math.max(leftInfo.height , rightInfo.height) + 1;

        return new Info(dia, height);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.right = new Node(8);

        // System.out.println(diameter(root));

        Info diaAndHeight = diameterAndHeight(root);
        System.out.println("The diameter and height of the tree is " + diaAndHeight.diameter + " and " + diaAndHeight.height);
    }
}
