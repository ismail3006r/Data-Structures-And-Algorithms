public class FirstLetterToUpperCase {
    public static void main(String[] args){
        String s="hi! i am patan ismail khan";
        StringBuilder sb = new StringBuilder("");
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(i==0||s.charAt(i-1)==' '){
                ch=Character.toUpperCase(ch);

            }           
            sb.append(ch);

            

        }
        System.out.println(sb);
    }
}
