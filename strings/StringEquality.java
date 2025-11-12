public class StringEquality {
    public static void main(String args[]){
        String s1="ismail";
        String s2="ismail";
        String s3=new String("ismail");
        System.out.println(s1==s2);
        System.out.println(s1==s3); //  == checks whether both strings pointing to same address
        System.out.println(s1.equals(s3)); //equals method checks the value of strings 
    }
    
}
