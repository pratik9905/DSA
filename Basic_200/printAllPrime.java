package Basic_200;
import Basic_200.ChecknumPrime;
//Print all prime numbers from 1 to N.
public class printAllPrime {
    public static void printAllPrime(int n){
        for(int i=2;i<=n;i++){
            if(ChecknumPrime.isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int n=100;
        printAllPrime(n);
    }

}
