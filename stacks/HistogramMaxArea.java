import java.util.Stack;

public class HistogramMaxArea {
    public static void nextSmallerLeft(int[] arr,int []nextSmallerL){
        Stack<Integer> s2 = new Stack<>();
        for(int i=0;i<arr.length;i++){
            int crr = arr[i];
            
            while(!s2.isEmpty()&&arr[s2.peek()]>crr){
                s2.pop();
            }
            nextSmallerL[i]=s2.isEmpty()?-1:s2.peek();
            s2.push(i);
        }
    }



    public static void nextSmallerRight(int[] arr,int[] nextSmallerR){
        Stack<Integer> s1 = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            int crr = arr[i];
            
            while(!s1.isEmpty()&&arr[s1.peek()]>crr){
                s1.pop();
            }
            nextSmallerR[i]=s1.isEmpty()?arr.length:s1.peek();
            s1.push(i);
        }
    }
    public static int hGramMaxArea(int[] heights){
        int maxArea = 0;
        int[] nextSmallerR=new int[heights.length];
        int[] nextSmallerL=new int[heights.length];
        nextSmallerRight(heights, nextSmallerR);
        nextSmallerLeft(heights, nextSmallerL);
        for(int i=0;i<heights.length;i++){
            int crrArea ;
            int width=nextSmallerR[i]-nextSmallerL[i]-1;
            crrArea = width * heights[i];
            if(maxArea<crrArea){
                maxArea=crrArea;
            }
            
        }
        return maxArea;

    }
    public static void main(String[] args) {
        int [] heights = {2,1,5,6,2,3};
        System.out.println(hGramMaxArea(heights));
    }
}
