import java.util.*;
public class StockSpanProblem {
    public static void Stockspan(ArrayList<Integer> Stocks,int [] span){
        Stack<Integer> s1 = new Stack<>();
        s1.push(0);
       
        span[0]=1;
        for(int i=1;i<Stocks.size();i++){
            while(!s1.isEmpty() && Stocks.get(s1.peek())<=Stocks.get(i)){
                s1.pop();
                
            }
            if (s1.isEmpty()) {
                span[i] = i + 1;
            } 
            else {
                span[i] = i - s1.peek();
            }
            s1.push(i);
        }
        

    }
    public static void main(String[] args) {
        
        ArrayList<Integer> Stocks = new ArrayList<>(Arrays.asList(100, 80, 60, 70, 60, 85, 100));

        int []span =new int[Stocks.size()]; 
        Stockspan(Stocks,span);
        for(int i=0;i<span.length;i++){
            System.out.println(span[i]);
        }




        
    }
    
}
