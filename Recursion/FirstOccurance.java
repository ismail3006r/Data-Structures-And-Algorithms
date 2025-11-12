public class FirstOccurance {
    public static int firstoccur(int arr[],int key,int i){
        if(i==arr.length){
            return -1 ;
            
        }
        else if(arr[i]==key){
            return i;
        }
        return firstoccur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,2,20,40,50};
        int idx = firstoccur(arr,20,0);
        System.out.println(idx);
    }
}
