public class BinaryStringNoConsecutive1 {
    public static void binStr(int n,int lastdigit,String s){
        if(n==0){
            System.out.println(s);
            return ;
        }
        binStr(n-1, 0, s+"0");
        if(lastdigit==0){
            binStr(n-1, 1 , s+"1");
        }
        

    }
    public static void main(String[] args) {
        binStr(5,0,"");
    }
    
}
