package Basic_200;

public class prnt100 {
    public static void print_1_100_without_loops(int n){
        if(n<=100) {System.out.println(n++);
        print_1_100_without_loops(n);}
    }

    public static void main(String[] args){
        int n=1;
        print_1_100_without_loops(n);
    }
}