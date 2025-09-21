public class Binary2Decimmal {
    public static int binary2Dec(String bin){
        int sum=0;
        int power = bin.length() - 1; // start from rightmost power

        for (char ch : bin.toCharArray()) {
            int digit = ch - '0';              // convert '0'/'1' → int
            sum += digit * Math.pow(2, power); // multiply by correct power
            power--;
        }
        return sum;
    }
    public static void main(String[] args) {
         String binary = "10001";
        System.out.println(binary2Dec(binary));    
    }
}
