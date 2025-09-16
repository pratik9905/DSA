package Basic_200;

public class ChecknumPrime {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=n;i++){//n%i is sqrt of n means: n=36, sqrt of n=6, i<=6 means i<=n%i and n=29, sqrt of n=5, i<=5 means i<=n%i
            if(n%i==0 && i<n){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=36;
        if(isPrime(n)){System.out.println(n+" is Prime");}
        else{System.out.println(n+" is not Prime");}
    }
}
