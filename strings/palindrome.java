import java.util.*;
public class palindrome {
    public static boolean IsPalindrome(String str){
        for(int i=0;i<(str.length())/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string to check palindrome : ");
        String str = sc.nextLine();
        if(IsPalindrome(str)){
            System.out.printf("%s is a palindrome ",str);
        } 
        else{
            System.out.printf("%s is not a palindrome ",str);
        }
    }
    
}
