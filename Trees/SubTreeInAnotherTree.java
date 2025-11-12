import java.util.*;

public class SubTreeInAnotherTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node n = new Node(nodes[idx]);
            n.left = buildTree(nodes);
            n.right = buildTree(nodes);
            return n;
        }
    }

    // check if two trees are identical
    public static boolean match(Node root, Node subroot) {
        if (root == null && subroot == null) return true;
        if (root == null || subroot == null) return false;
        if (root.data != subroot.data) return false;

        return match(root.left, subroot.left) && match(root.right, subroot.right);
    }

    // check if subroot exists somewhere in root
    public static boolean found(Node root, Node subroot) {
        if (root == null) return false;

        if (root.data == subroot.data && match(root, subroot)) {
            return true;
        }

        return found(root.left, subroot) || found(root.right, subroot);
    }

    // main function to check if subroot is a subtree
    public static boolean isSubtree(Node root, Node subroot) {
        if (subroot == null) return true;  // empty tree is always a subtree
        if (root == null) return false;

        return found(root, subroot);
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int[] nodes2 = {2, 4, -1, -1, 5, -1, -1};

        BinaryTree b1 = new BinaryTree();
        Node root = b1.buildTree(nodes);

        BinaryTree b2 = new BinaryTree();
        Node subroot = b2.buildTree(nodes2);

        System.out.println("Is subtree: " + isSubtree(root, subroot));
    }
}
