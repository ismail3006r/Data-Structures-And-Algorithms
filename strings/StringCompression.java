public class StringCompression{
    public static void main(String args[]){
        String s ="aaaabbbccd";
        
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            Integer count =1;
            char ch = s.charAt(i);
            while (i<(s.length()-1)&&ch==s.charAt(i+1)) {
                count++;
                i++;


            }
            sb.append(ch);
            if(count>1){
                sb.append(count.toString());

            }
            
        }
        System.out.println(sb);
    }
}