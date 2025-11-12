import java.util.*;
public class ReverseAStack {

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){

            return;
        }
        int deleted = s.pop();
        reverse(s);
        pushAtBottom(s, deleted);
    }

    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int deleted = s.pop();
        pushAtBottom(s, data);
        s.push(deleted);
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        reverse(s1);
        while(!s1.empty()){
            System.out.println(s1.peek());
            s1.pop();
        }
        
    }
    
}
