import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i =0;i<n-1;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }

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
        bubbleSort(arr);
        System.out.print("\nsorted array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
    
}
