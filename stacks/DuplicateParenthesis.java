import java.util.*;
public class DuplicateParenthesis {   //considering that the given exp having parentheses
    public static boolean duplicateParanthesis(String exp){
        Stack<Character> s1 = new Stack<>();
        for(int i=0;i<exp.length();i++){

            char ch = exp.charAt(i);
            if(ch!=')'){
                s1.push(ch);
            }
            else{

                int count = 0;
                while(!s1.isEmpty()&&s1.peek()!='('){
                    s1.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                if(!s1.isEmpty()){
                    s1.pop();
                    
                }
                
            }
            

            
        }
        return false;
    }
    public static void main(String[] args) {
        String exp = "((a+(b))+(c+d))";
        System.out.println(duplicateParanthesis(exp));
    }
}
