
import java.util.*;
public class CountOfNodes {
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
    static int idx = -1;
    static class BinaryTree{
        public Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node n = new Node(nodes[idx]);
            n.left=buildTree(nodes);
            n.right=buildTree(nodes);

            return n;
            
        }

        public int countNodes(Node root){
            if(root==null){
                return 0;
            }
            int ln = countNodes(root.left);
            int rn=countNodes(root.right);
            int count = ln+rn+1;
            return count;

        }

        
                
                
            
        

    }
    


    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree b1 = new BinaryTree();
        Node root = b1.buildTree(nodes);


        System.out.println(b1.countNodes(root));
        
    }
}
