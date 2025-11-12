import java.util.*;
public class BasicTreeBuild {
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

        public void preOrder(Node root){
            if(root == null){
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public void inOrder(Node root){
            if(root == null){
                System.out.print("-1 ");
                return;
            }
            
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public void postOrder(Node root){
            if(root == null){
                System.out.print("-1 ");
                return;
            }
            
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

        public void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null); 
            while(!q.isEmpty()){
                Node n = q.remove();
                if(n!=null){

                    System.out.print(n.data+" ");
                    if(n.left!=null){
                        q.add(n.left);
                    }
                    if(n.right!=null){
                        q.add(n.right);
                    }

                }
                
                else{
                    
                    System.out.println();
                    if(!q.isEmpty())
                        q.add(null);

                }
                
                
            }
        }

    }
    


    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree b1 = new BinaryTree();
        Node root = b1.buildTree(nodes);

        System.out.println(root.data);

        b1.preOrder(root);
        System.out.println();

        b1.inOrder(root);
        System.out.println();

        b1.postOrder(root);
        System.out.println();

        b1.levelOrder(root);
        
    }
}
