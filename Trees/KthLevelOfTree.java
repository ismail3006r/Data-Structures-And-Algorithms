import java.util.*;
public class KthLevelOfTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }


    }
    static class BinaryTree{
        static int idx=-1;
        public Node buildTree(int [] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node n = new Node(nodes[idx]);
            n.left=buildTree(nodes);
            n.right=buildTree(nodes);
            return n;

        }

        
    }
    public static void kthlevel(Node root,int level){
        if(root==null) return;
        if(level==1){
            System.out.print(root.data+" ");
            return;
        }
        kthlevel(root.left, level-1);
        kthlevel(root.right, level-1);

    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, 8, 16, -1, -1, 17, -1, -1, 9, 18, -1, -1, 19, -1, -1, 5, 10, 20, -1, -1, 21, -1, -1, 11, 22, -1, -1, 23, -1, -1, 3, 6, 12, 24, -1, -1, 25, -1, -1, 13, 26, -1, -1, 27, -1, -1, 7, 14, 28, -1, -1, 29, -1, -1, 15, 30, -1, -1, 31, -1, -1};
        BinaryTree b1 = new BinaryTree();
        Node root = b1.buildTree(nodes);
        kthlevel(root,4);
    }
}