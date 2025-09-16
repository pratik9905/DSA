package Basic_200;

public class LCM {
    public static int lcm(int a,int b){
        return (a*b)/GCD2Num.gcd(a,b);
    }
    public static void main(String[] args) {
        int a=4;
        int b=6;
        System.out.println(lcm(a,b));
    }
}