package Tree;

import java.util.ArrayList;

public class LowestCommonAncestor {

    // O(n)
    static boolean getPath(Node root, int n, ArrayList<Node> list){
        if(root == null) return false;
        list.add(root);
        if(root.data == n) return true;
        if(getPath(root.left, n, list) || getPath(root.right, n, list)) return true;
        list.remove(list.size() - 1);
        return false;
    }

    // O(n)
    static Node lca(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0, j = 0;
        Node ans = null;
        while(i < path1.size() && j < path2.size()){
            if(path1.get(i) == path2.get(j)){
                ans = path1.get(i);
                i++;
                j++;
            }else{
                break;
            }
        }
        return ans;

    }

    static Node lca2(Node root, int n1, int n2){

        if(root == null || root.data == n1 || root.data == n2) return root;

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if(rightLca == null) return leftLca;
        if(leftLca == null) return rightLca;

        return root;
    }

    static int lcadist(Node lca, int n){
        if(lca == null) return -1;
        if(lca.data == n) return 0;

        int leftDist = lcadist(lca.left, n);
        int rightDist = lcadist(lca.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }else if(leftDist == -1){
            return rightDist + 1;
        }else{
            return leftDist + 1;
        }
    }
    static int minDist(Node root, int n1, int n2){
        Node lca = lca2(root, n1, n2);
        int dist1 = lcadist(lca, n1);
        int dist2 = lcadist(lca, n2);

        return dist1 + dist2;
    }

    static int kthAncestor(Node root, int n, int k){
        if(root == null) return -1;
        if(root.data == n) return 0;
        int leftDist = kthAncestor(root.left, n, k);
        int rightDist = kthAncestor(root.right, n, k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if(max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node commonAncestor = lca2(root, 4, 2);
        if(commonAncestor == null){
            System.out.println("There is no common ancestor of these two nodes");
        }else{
            System.out.println(commonAncestor.data);
        }

        System.out.println(minDist(root, 4, 5));

        kthAncestor(root, 5, 2);

    }
}
