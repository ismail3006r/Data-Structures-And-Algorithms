public class HeightOfATree {
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

        public int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh = height(root.right);
            int h = Math.max(lh, rh)+1;
            return h ;
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, 8, 16, -1, -1, 17, -1, -1, 9, 18, -1, -1, 19, -1, -1, 5, 10, 20, -1, -1, 21, -1, -1, 11, 22, -1, -1, 23, -1, -1, 3, 6, 12, 24, -1, -1, 25, -1, -1, 13, 26, -1, -1, 27, -1, -1, 7, 14, 28, -1, -1, 29, -1, -1, 15, 30, -1, -1, 31, -1, -1};
        BinaryTree b1 = new BinaryTree();
        Node root = b1.buildTree(nodes);
        System.out.println(b1.height(root));
    }
}