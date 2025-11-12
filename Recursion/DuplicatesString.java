//remove dulicate characters in a string
public class DuplicatesString {
    public static void removeduplicates(String s,int i,StringBuilder sb,int arr[]){
        
        if(i==s.length()){
            return;
        }
        if(arr[s.charAt(i)-'a']==0){
            sb.append(s.charAt(i));
            arr[s.charAt(i)-'a']=1;

        }
        removeduplicates(s, i+1,sb,arr);
    }
    public static void main(String[] args) {
        String s = "pAtanismailkhan";
        StringBuilder sb = new StringBuilder("");
        int arr []=new int[26]; 
        removeduplicates(s.toLowerCase(),0,sb,arr);
        System.out.println(sb);
    }
}
