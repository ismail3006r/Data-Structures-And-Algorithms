import java.util.*;
public class StackArrList {
    
    static class Stack{
        int top = -1;
        ArrayList <Integer > list = new ArrayList<>();
        void push(int data){
            list.add(data);
            top++;
        }
        int pop(){
            if(top==-1){
                System.out.println("stack is empty");
                return top;

            }
            int deleted = list.get(top);
            list.remove(top);
            top--;
            return deleted;
        }

        int peek(){
            return list.get(top);
        }
        void display(){
            System.out.println(list);
        }


    }
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(0);
        s1.push(37);
        s1.display();
        System.out.println(s1.pop());
        System.out.println(s1.peek());

        
    }
    
}
