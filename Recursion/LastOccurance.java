public class LastOccurance {
    public static int lastoccur(int arr[],int key,int n){
        if(n==-1||arr[n]==key){
            return n;
        }
        return lastoccur(arr, key, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,2,20,40,50};
        int idx = lastoccur(arr,50,arr.length-1);
        System.out.println(idx);
    }
}
