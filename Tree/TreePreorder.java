package Tree;
import java.util.Queue;
import java.util.LinkedList;

public class TreePreorder {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public Node buildTree(int[] nodes){
            index++;
            if(nodes[index] == -1) return null;
            Node node = new Node(nodes[index]);
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }

        // O(n)
        public void preOrder(Node root){
            if(root == null) return;
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        //O(n)
        public void inOrder(Node root){
            if(root == null) return;
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        //O(n)
        public void postOrder(Node root){
            if(root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        // O(n)
        public void levelOrder(Node root){
            if(root == null) return;
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            queue.offer(null);

            while(!queue.isEmpty()){
                Node curr = queue.poll();
                if(curr == null){
                    System.out.println();
                    if(queue.isEmpty()) break;
                    else queue.offer(null);
                }else{
                    System.out.print(curr.data + " ");
                    if(curr.left != null) queue.offer(curr.left);
                    if(curr.right != null) queue.offer(curr.right);
                }
            }
        }

        // O(n)
        public int height(Node root){
            if(root == null) return -1;
            return 1 + Math.max(height(root.left), height(root.right));
        }

        // O(n)
        public int countNodes(Node root){
            if(root == null) return 0;
            return countNodes(root.left) + countNodes(root.right) + 1;
        }

        // O(n)
        public int sumOfNodes(Node root){
            if(root == null) return 0;
            return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree btree = new BinaryTree();
        Node root = btree.buildTree(nodes);
        btree.preOrder(root);
        System.out.println();
        btree.inOrder(root);
        System.out.println();
        btree.postOrder(root);
        System.out.println();
        btree.levelOrder(root);
        System.out.println(btree.height(root));
        System.out.println(btree.countNodes(root));
        System.out.println(btree.sumOfNodes(root));
    }
}
