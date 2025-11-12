
public class StackLL {
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    static class Stack {
        static Node head =null;
        void push(int val){
            Node n = new Node(val);
            n.next=head;
            head=n;

        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            int deleted = head.data;
            head= head.next;
            return deleted;
        }
        int peek(){
            return head.data;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(5);
        s1.display();
        s1.pop();
        
        s1.display();
        
    }
    
}
