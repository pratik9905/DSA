package Basic_200;

public class StrongNum {
    public static int fact(int n){
        if(n==1 || n==0) return 1;
        return n*fact(n-1);
    }

    public static boolean isStrong(int n){
        int sum=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            sum+=fact(digit);
            temp/=10;
        }
        return sum==n;
    }
    public static void main(String[] args) {
        int n=145;
        System.out.println(isStrong(n)?"true":"false");
    }
}
