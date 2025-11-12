import java.util.*;
public class ValidParanthesis {
    public static boolean isMatch(char CB,char OB){
         if((CB==')'&&OB=='(')||(CB=='}'&&OB=='{')||(CB==']'&&OB=='['))return true;
         else return false;
    }
    public static boolean isValid(String exp){

        Stack<Character> s1 = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                s1.push(ch);
            }
            if((ch==')'||ch==']'||ch=='}')){
                if(!s1.isEmpty()){
                    if(isMatch(ch,s1.peek())){
                        s1.pop();
                    }
                    else{
                        return false;
                    }
                }else return false;
            }
            

        }
        if(s1.isEmpty()){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        String exp = "([[]])()";
        System.out.println(isValid(exp));
    }
}
