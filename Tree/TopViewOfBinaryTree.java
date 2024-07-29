package Tree;
import java.util.*;

public class TopViewOfBinaryTree {
    static class Info{
        Node node;
        int dist;

        Info(Node node, int dist){
            this.node = node;
            this.dist = dist;
        }
    }
    static void printTopView(Node root){
        Queue<Info> queue = new LinkedList<>();
        queue.offer(new Info(root, 0));

        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(!queue.isEmpty()){
            Info curr = queue.poll();
            if(min > curr.dist) min = curr.dist;
            if(max < curr.dist) max = curr.dist;
            if(!map.containsKey(curr.dist)){
                map.put(curr.dist, curr.node.data);
            }
            if(curr.node.left != null) queue.offer(new Info(curr.node.left, curr.dist-1));
            if(curr.node.right != null) queue.offer(new Info(curr.node.right, curr.dist+1));
        }
        for(int i = min; i<=max; i++){
            System.out.print(map.get(i) + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.right = new Node(4);
        // root.left.right.right = new Node(5);
        // root.left.right.right.right = new Node(6);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        printTopView(root);
    }
}
