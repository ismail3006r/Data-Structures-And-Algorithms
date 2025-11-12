//this method is only applicable to +ve numbers
//the range should be smaller i.e the numbers should be small integers 
  

import java.util.Scanner;
public class CountingSort {
    public static void countingSort(int arr[]){
        int n=arr.length,largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int countArr[]=new int[largest+1];
        for(int i=0;i<n;i++){
            countArr[arr[i]]++;

            
        }
        int j=-1;
        for(int i=0;i<=largest;i++){
            while(countArr[i]>0){
                arr[++j]=i;
                countArr[i]--;
                
            }

        }
        
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size : ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements : ");
        for(int i=0;i<n;i++){
            System.out.print("enter el "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("original array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        countingSort(arr);
        System.out.print("\nsorted array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
    
}
