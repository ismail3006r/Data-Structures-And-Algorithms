public class PairingProblem {
    public static int pairing(int n){
        if(n==1||n==2){
            return n;
        }
        int single = pairing(n-1);
        int pairs = (n-1)*pairing(n-2);
        int total = single + pairs;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(pairing(3));
    }
}
