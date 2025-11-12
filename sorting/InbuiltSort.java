import java.util.*;
public class InbuiltSort {
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
        Arrays.sort(arr);
        System.out.print("\nsorted array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
    
}
