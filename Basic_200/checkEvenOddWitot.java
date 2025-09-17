package Basic_200;
//Check if number is even/odd without %.
public class checkEvenOddWitot {
    public static void main(String[] args) {
        int n=5;
        if((n & 1) == 0){//here & is used as AND operator// it workes on binary form of number//like 5=101 & 1=001=0 so odd//eg: 100 & 010=
            System.out.println("Even");
        }else{
            System.out.println("Odd");
    }
}
