package Basic_200;

public class fibbonaci {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        // if(n<=1){
        //     return n;
        // }
        // return fib(n-1)+fib(n-2);
        int a=0;
        int b=1;
        if(n==0) return a;
        if(n==1) return b;
        int c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
