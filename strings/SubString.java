import java.util.*;
public class SubString {
    public static void substring(String str,int si,int ei){
        for(int i=si;i<ei;i++){
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String args[]){
        String str = "ismail khan";
        int si=2,ei=6;
        
        substring(str,si,ei);
        str=str.substring(2,6);
        System.out.println(str);
        
    }
    
}
