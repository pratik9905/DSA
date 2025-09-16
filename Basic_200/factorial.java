// Find factorial of a number (loop & recursion).

package Basic_200;

class factorial {

    public static int factorial_loop(int n){
        int fact=1;
        for(int i=1;i<n;i++){
            fact*=i;
            System.out.println(fact);
        }
        return fact;

    }
    public static void main(String[] args) {
        int n=5;
        int fact=factorial_loop(n);
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}
