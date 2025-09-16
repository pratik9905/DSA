package Basic_200;

public class Armstrong {
    public static boolean isArmstrong(int n){
        int temp=n;
        double sum=0;
        int count=countDigit(n);
        while(temp>0){
            int rem=temp%10;
            sum+=Math.pow(rem, count);
            temp/=10;
        }
        return sum==n;
    }

    public static int countDigit(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n=153;
        System.out.println(isArmstrong(n)?"true":"false");
    }
}
