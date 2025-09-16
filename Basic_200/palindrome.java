    package Basic_200;

    public class palindrome {
        public static void main(String[] args) {
            int x=121;
            System.out.println(palindrome(x));
        }

    public static boolean palindrome(int n){
    // int temp=n;
    // int rev=0;
    // int rem=0;
    // while(temp>0){
    // rem=temp%10;
    // rev=rev*10+rem;
    // temp/=10;
    // }
    // if(rev==n) return true;

    // return false;

        String s=Integer.toString(n);
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
