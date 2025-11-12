import java.util.*;
public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n=sc.nextInt();
        int x=fact(n);
        System.out.printf("%d!=%d",n,x);
    }
    
}
