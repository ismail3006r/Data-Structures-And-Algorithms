import java.util.*;
public class reverseAString {
    public static void main(String[] args) {
        Stack <Character> s1 = new Stack<>();
        String str = "ismail";
        for(int i=0;i<str.length();i++){
            s1.push(str.charAt(i));
        }
        while(!s1.isEmpty()){
            System.out.print(s1.pop());
        }
        
    }
    
    
}
