package Basic_200;

public class swap2NumWithot3Var {

    public static void swap(int a, int b){
        System.out.println("Swapping "+a+" and "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapped "+a+" and "+b);
    }
    public static void main(String[] args) {
        int a=10, b=20;
        swap(a,b);
    }
}