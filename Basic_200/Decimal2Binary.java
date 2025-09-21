
class Decimal2Binary{

public static String dec2Bin(int num){
    
    StringBuilder sb = new StringBuilder();
while(num>0){
    int rem = num % 2;
    sb.append(rem);
    num /= 2;
}
return sb.reverse().toString();
}

public static void main(String[] args) {
    int Dec =20;
    System.out.println(dec2Bin(Dec));
}

}