package Basic_200;


import java.util.*;

public class perfectNum {
    public static boolean isPerfect(int n){
        int sum=0;
        List<Integer> factores=factores(n);
        for(int i:factores){    
            sum+=i;
        }
        return sum==n;
    }

    public static List<Integer> factores(int n){
        List<Integer> factores = new ArrayList<>();
        for(int i=1;i<n/2;i++){
            if(n%i==0){
                factores.add(i);
            }
        }
        return factores;
    }
    // public static boolean isPerfect(int n){
    //     int sum=0;
    //     for(int i=1;i<=n/2;i++){//n/2 is used because no number can be divided by a number greater than its half except itself// suppose n=28, then every time n/2=,28/2=14
    //         if(n%i==0){
    //             sum+=i;
    //         }
    //     }
    //     return sum==n;
    // }

    public static void main(String[] args) {
        int n=28;
        System.out.println(isPerfect(n)?"true":"false");
    }
}
