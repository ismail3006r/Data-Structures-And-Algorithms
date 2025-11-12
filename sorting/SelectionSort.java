import java.util.*;
public class SelectionSort {
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minidx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minidx]){
                    minidx=j;
                }
            }
            if(minidx!=i){
                int temp=arr[minidx];
                arr[minidx]=arr[i];
                arr[i]=temp;
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
        selectionSort(arr);
        System.out.print("\nsorted array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
    
}
