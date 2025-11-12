import java.util.*;
public class NextGreaterElement {
    public static void findNextGreater(int arr[],int nextGreater[]){
        Stack<Integer> s1 = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            int crr = arr[i];
            
            while(!s1.isEmpty()&&s1.peek()<crr){
                s1.pop();
            }
            nextGreater[i]=s1.isEmpty()?-1:s1.peek();
            s1.push(crr);
        }

    }

    public static void main(String [] args){
        int [] arr = {6,8,0,1,3};
        int [] nextGreater=new int [arr.length];
        findNextGreater(arr,nextGreater);

        
        for(int i:nextGreater){
            System.err.println(i);
        }

    }
}
 

