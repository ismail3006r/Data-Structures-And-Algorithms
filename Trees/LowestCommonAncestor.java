import java.util.*;

public class LowestCommonAncestor {

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
    public static boolean findPath(Node root,int n,ArrayList<Integer> al){
        if(root==null){
            return false;
        }
        al.add(root.data);
        if(root.data==n){
            return true;
        }
        if(findPath(root.left, n, al)||findPath(root.right, n, al)){
            return true;
        }
        al.remove(al.size()-1);
        return false;
    }
    public static void findLCA(Node root,int n1,int n2){
        ArrayList <Integer> a1 = new ArrayList<>();
        ArrayList <Integer> a2 = new ArrayList<>();
        findPath(root,n1,a1);
        findPath(root,n2,a2);
        int i=0;
        while(i<a1.size()&&i<a2.size()){
            if(a1.get(i)!=a2.get(i)){
                break;
            }
            
            i++;

        }
        
        System.out.println(a1.get(i-1));

    }
    
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, 8, 16, -1, -1, 17, -1, -1, 9, 18, -1, -1, 19, -1, -1, 5, 10, 20, -1, -1, 21, -1, -1, 11, 22, -1, -1, 23, -1, -1, 3, 6, 12, 24, -1, -1, 25, -1, -1, 13, 26, -1, -1, 27, -1, -1, 7, 14, 28, -1, -1, 29, -1, -1, 15, 30, -1, -1, 31, -1, -1};
        BinaryTree b1 = new BinaryTree();
        Node root = b1.buildTree(nodes);
       
        findLCA(root,21,20);
    }
}