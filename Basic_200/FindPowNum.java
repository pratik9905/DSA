// Find power of a number without using Math.pow().

public class FindPowNum {
    

    public static void main(String[] args) {
        int pow=3;
        int val=3;
        int num = findPow(val,pow);
        System.out.println(num);
    }

    public static int findPow(int val , int pow){
        int res=0;
        for(int i=1;i<=pow;i++){
            res+=val*val;
        }
        return res;
    }
}
