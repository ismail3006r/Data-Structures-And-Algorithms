import java.util.*;
public class NthFibonacciNo {
    public static int fib(int n){
        if(n==1||n==2){
            return n-1;
        }
        
        return fib(n-2)+fib(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n=sc.nextInt();
        int x=fib(n);
        System.out.print(x);
    }
    
}
