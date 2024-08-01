package Tree;
import Tree.TreeTraversal.*;
import java.util.*;
public class BST {
    static BinaryTree btree = new BinaryTree();
    public static Node insert(Node root, int val){
        Node node = new Node(val);
        if(root == null) return node;
        if(root.data > val) root.left = insert(root.left, val);
        else if(root.data < val) root.right = insert(root.right, val);
        return root;
    }
    static Node buildBST(int[] arr){
        Node root = null;
        for(int i = 0; i<arr.length; i++){
            root = insert(root, arr[i]);
        }
        return root;
    }

    static boolean search(Node root, int key){
        if(root == null) return false;
        if(root.data == key) return true;

        if(root.data < key) return search(root.right, key);
        else return search(root.left, key);
    }

    static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }else if(root.data > val){
            root.left = delete(root.left, val);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }else if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                Node inSuc = inorderSuccessor(root.right);
                root.data = inSuc.data;
                root.right = delete(root.right, inSuc.data);
            }
        }
        return root;
    }

    static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    static void printInRange(Node root, int l, int h){
        if(root == null) return;
        if(root.data >= l && root.data <= h){
            printInRange(root.left, l, h);
            System.out.print(root.data + " ");
            printInRange(root.right, l, h);
        }else if(root.data < l){
            printInRange(root.right, l, h);
        }else{
            printInRange(root.left, l, h);
        }
    }

    static void printRootToLeafPaths(Node root, ArrayList<Integer> list){
        if(root == null) return;
        list.add(root.data);
        if(root.left == null && root.right == null){
            System.out.println(list);
            return;
        }
        printRootToLeafPaths(root.left, list);
        printRootToLeafPaths(root.right, list);
        list.remove(list.size()-1);
    }

    static boolean isValidBST(Node root, int min, int max){
        if(root == null) return true;
        if(root.data >= max || root.data <= min) return false;

        return isValidBST(root.left, min, root.data) && isValidBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2,7};
        Node root = buildBST(arr);

        // root = delete(root, 3);
        btree.inOrder(root);
        System.out.println();
        System.out.println(search(root, 3));

        printInRange(root,4, 8);
        System.out.println();

        printRootToLeafPaths(root, new ArrayList<>());
        
        root.left.left = new Node(6);
        System.out.println(isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
