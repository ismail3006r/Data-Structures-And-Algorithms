import java.util.*;
public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){              
               arr[j+1]=arr[j];
                j--;
                                
            }
            arr[j+1]=key;
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
        insertionSort(arr);
        System.out.print("\nsorted array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
    
}
