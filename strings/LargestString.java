//compareTo() returns 0 if strings are equal
//it returns -ve value if s is lower
//it returns +ve value if s is larger
public class LargestString {
    public static void main(String args[]){
        String strings[]={"ismail","khan","patan","irfan"};
        String largest = strings[0];
        for(int i=1;i<strings.length;i++){
            if(strings[i].compareToIgnoreCase(largest)>0){
                largest=strings[i];
            }
        }
        System.out.println(largest);
    }
    
}
