package Basic_200;

public class GCD2Num {
    // public static int gcd(int a,int b){
    //     if(b==0) return a;
    //     return gcd(b,a%b);
    // }


    public static int gcd(int a,int b){
        while(b!=0){
            int rem=a%b;//remainder after dividing a by b means 56%98=56//again 98%56=42//again 56%42=14//again 42%14=0
            a=b;//a becomes b means a=98//again a=56//again a=42//again a=14
            b=rem;//b becomes remainder means b=56//again b=42//again b=14//again b=0
        }
        return a;
    }
    public static void main(String[] args) {
        int a=56;
        int b=98;
        System.out.println(gcd(a,b));
    }
}
