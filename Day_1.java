import java.util.Scanner;

class Day_1{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Day_1 prime = new Day_1();
    
    System.out.println(prime.isPrime(n) ? "Value is Prime" : "Value is Not Prime");

    
}
public boolean isPrime(int n) {
    //your code goes here
    for(int i=2;i<n;i++){
        if(n%i==0) return false;
    }
    return true;
}
}